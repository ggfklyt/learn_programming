#! /bin/sh
#	test.sh
while read c; do
	actual=`./actual $c`
	expected=`./expected $c`
	if [ $actual != $expected ]; then
		echo TEST $c FAILED: expected $expected actual $actual
	fi
done<<END
	4
	2
	.
	,
	/
	?
	3
	0
	f
	A
END
