#! /bin/sh
#	test.sh
while read s c n; do
	actual=`./actual $s $c $n`
	expected=`./expected $s $c $n`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s $c $n FAILED: expected $expected actual $actual
	fi
done<<END
	gdfg d 0
	gdfg d 1
	gdfg d 2
	gdfg d 3
	gdfg d 4
	gdfg d 5
	gdfg d 6
	gdfg d 7
	gdfg d 8
	gdfg e 10
	"" g 3
END
