#! /bin/sh
#	test.sh
while read s1 s2; do
	expected=`./expected $s1 $s2`
	actual=`./actual $s1 $s2`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s1 $s2 FAILED: expected "$expected" actual "$actual"
	fi
done<<END
	ab ba
	"" "1"
	"aykhan" "dev"
END
