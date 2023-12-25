#! /bin/sh
#	test.sh
while read dst src dstsize; do
	actual=`./actual $dst $src $dstsize`
	expected=`./expected $dst $src $dstsize`
	if [ "$actual" != "$expected" ]; then
		echo TEST $dst $src $dstsize FAILED: expected $expected actual $actual
	fi
done<<END
	aaa bb 0
	aaa bb 1
	aaa bb 2
	aaa bb 3
	aaa bb 4
	aaa bb 5
END
