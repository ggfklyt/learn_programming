#! /bin/sh
#	test.sh
while read s1 s2 n; do
	actual=`./actual $s1 $s2 $n`
	expected=`./expected $s1 $s2 $n`
	if [ "$actual" != "$expected" ]; then
		echo TEST $s1 $s2 $n FAILED: expected $expected actual $actual
	fi
done<<END
	gfdgfd gfda 0
	gfdgfd gfda 1
	gfdgfd gfda 2
	gfdgfd gfda 3
	gfdgfd gfda 4
	gfdgfd gfda 5
	gfdgfd gfda 6
	gf gfsffd 0
	gf gfsffd 1
	gf gfsffd 2
	gf gfsffd 3
	gf gfsffd 4
	gf gfsffd 5
END
