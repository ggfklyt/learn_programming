#! /bin/sh
#	test.sh
while read nb expected; do
	actual=`./actual $nb`
	if [ $expected != $actual ]; then
		echo TEST $nb FAILED: expected $expected actual $actual
	fi
done<<END
	0 1 
	1 1
	2 2
	3 6
	4 24
	5 120
	6 720
END
