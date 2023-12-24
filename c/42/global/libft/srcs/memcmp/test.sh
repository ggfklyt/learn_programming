#! /bin/sh
#	tests.sh
while read s1 s2 n; do
	actual=`./actual $s1 $s2 $n`
	expected=`./expected $s1 $s2 $n`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s1 $s2 $n FAILED: expected $expected actual $actual
	fi
done<<END
	abc abc 0
	abc abc 1
	abc abc 2
	abc abc 3
	abc abc 4
	abc abc 5
	abc cbc 0
	abc cbc 1
	abc cbc 2
	abc cbc 3
	abc cbc 4
	abc cbc 5
	abcd abc 0
	abcd abc 1
	abcd abc 2
	abcd abc 3
	abcd abc 4
	abcd abc 5
END
