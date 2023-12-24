#! /bin/sh
#	test.sh
while read b c len; do
	actual=`./actual $b $c $len`
	expected=`./expected $b $c $len`
	if [ "$actual" != "$expected" ]; then
		echo TEST $b $c $len FAILED: expected $expected actual $actual
	fi
done<<END
	ab 100 5
	abba 99 3
	"" 98 0
END
