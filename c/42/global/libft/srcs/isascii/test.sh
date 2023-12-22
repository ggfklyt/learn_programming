#! /bin/sh
#	test.sh
while read c; do
	actual=`./actual $c`
	expected=`./expected $c`
	if [ $actual != $expected ]; then
		echo TEST $c FAILED: expected $expected actual $actual
	fi
done<<END
	1
	3
	123
	34
	342
	f
	" "
END
