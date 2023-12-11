#! /bin/sh
#	test.sh
while read s expected; do
	res=`./actual $s`
	if [ "$res" != "$expected" ]; then
		echo TEST $s FAILED: expected "$expected" actual "$actual"
	fi
done<<END
	432 432
	2 2
	14 14
	0 0
	10 10
END
