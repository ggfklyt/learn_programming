#!/bin/sh
#	test.sh
while read s1 s2 n; do
	actual=`./actual $s1 $s2`
	expected=`./expected $s1 $s2`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s1 $s2 $n FAILED: expected "$expected" actual "$actual"
	fi
done <<END
	abba aber 2
	abba aber 3
	"" "" 3
	" " " 2" 2
	abba abba 6
END
