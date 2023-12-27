#! /bin/sh
#! test.sh
while read dst src n; do
	actual=`./actual $dst $src $n`
	expected=`./expected $dst $src $n`
	if [ "$actual" != "$expected" ]; then
		echo TEST $dst $src $n FAILED: expected $expected actual $actual
	fi
done<<END
	aa gdfd 1
	aa gdfd 2
	aa gdfd 3
	aa gdfd 4
	aa gdfd 5
	aa gdfd 6
	aa "" 4
	aa gdfd 0
END
