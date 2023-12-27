#! /bin/sh
#	test.sh
while read dst src c n; do
	actual=`./actual $dst $src $c $n`
	expected=`./expected $dst $src $c $n`
	if [ "$actual" != "$expected" ]; then
		echo TEST $dst $src $c $n FAILED: expected $expected actual $actual
	fi
done<<END
	ab joidfg o 3
	ab joidfg o 1
	ab joidfg o 2
	ab joidfg o 3
	ab joidfg o 4
	ab joidfg 1 0
	ab joidfg f 2
	ab joidfg g 3
	ab joidfg d 4
	ab joidfg i 5
	ab joidfg o 6
END
