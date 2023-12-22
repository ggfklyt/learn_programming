#! /bin/sh
#	test.sh
while read str; do
	actual=`./actual $str`
	expected=`./expected $str`
	if [ "$actual" != "$expected" ]; then
		echo TEST $str FAILED: expected $expected actual $actual
	fi
done<<END
	fsdf33
	23
	002
	01
	0
	""
	009043
	-4324
	fdf-32fdg
	34-20fd
	gfd-32+3
	+-+-1
	+-2+3
	--2+5
	--
	++1
END
