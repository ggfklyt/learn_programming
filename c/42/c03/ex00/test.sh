#!/bin/sh
#	test.sh
while read a b; do

	actual=`./actual $a $b`
	expected=`./expected $a $b`
	if [ "$actual" != "$expected" ]; then
		echo TEST $a $b FAILED: expected "$expected", got "$actual"
	fi
done << END
	abba abba
	abba baba
	abbar abba
	"" ""
	  
END
