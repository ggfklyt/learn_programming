# /bin/sh
# 	test.sh
while read c; do
	actual=`./actual $c`
	expected=`./expected $c`
	if [ $actual != $expected ]; then
		echo TEST $c FAILED: expected $expected actual $actual
	fi
done<<END
	5
	2
	g
	A
	Z
	z
	,
	%
END
