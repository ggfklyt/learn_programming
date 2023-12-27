#! /bin/sh
#	test.sh
while read s c; do
	actual=`./actual $s $c`
	expected=`./expected $s $c`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s $c FAILED: expected $expected actual $actual
	fi
done<<END
	dasdas a
	gdffdg j
	"" f
	fdfd 0
END
