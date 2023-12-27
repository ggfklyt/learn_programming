#! /bin/sh

while read str; do
	actual=`./actual $str`
	expected=`./expected $str`
	if [ $actual !=  $expected ]; then
		echo TEST $str FAILED: expected $expected expected $actual actual
	fi
done<<END
	abba
END
