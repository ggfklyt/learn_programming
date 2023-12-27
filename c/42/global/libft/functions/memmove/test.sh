#! /bin/sh
#	tests.h
while read dst len; do
	actual=`./actual $dst $len`
	expected=`./expected $dst $len`
	if [ "$actual" != "$expected" ]; then
		echo TEST $dst $len FAILED: expected $expected actual $actual
	fi
done<<END
	fsdfdsf 0
	fsdfdsf 1
	fsdfdsf 2
	fsdfdsf 3
	fsdfdsf 4
	fsdfdsf 5
	fsdfdsf 6
	fsdfdsf 7
	fsdfdsf 8
	fsdfdsf 9
	fsdfdsf 10
	fsdfdsf 11
END
