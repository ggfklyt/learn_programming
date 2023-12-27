#! /bin/sh
#	test.sh
while read dst src dstsize; do
	actual=`./actual $dst $src $dstsize`
	expected=`./expected $dst $src $dstsize`
	if [ "$actual" != "$expected" ]; then
		echo TEST $dst $src $dstsize FAILED: expected $expected actual $actual
	fi
done<<END
	ab racadabra 1
	ab racadabra 2
	ab racadabra 5
	ab racadabra 10
	ab racadabra 15
	1 3 4
END
