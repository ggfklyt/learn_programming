#! /bin/sh
#	test.sh
while read s1 s2; do
	actual=`./actual $s1 $s2`
	expected=`./expected $s1 $s2`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s1 $s2 FAILED: expected "$expected" actual "$actual"
	fi
done<<END
	abba ab
	babadan ada
	ramadan goj
	gojgoj goj
	rovovo vo
END
