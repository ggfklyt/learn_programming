#! /bin/sh
#	test.sh
while read num; do
	actual=`./actual $num`
	if [ "$actual" != $num ]; then
		echo TEST $num FAILED: expected $num actual $actual
	fi
done<<END
	42
	0
	3
	2435565
	100000
END
