#! /bin/sh
#	test.sh
while read haystack needle len; do
	actual=`./actual $haystack $needle $len`
	expected=`./expected $haystack $needle $len`
	if [ "$actual" != "$expected" ]; then
		echo TEST $haystack $needle $len FAILED: expected $expected actual $actual
	fi
done<<END
	abracad "" 0
	abracad "" 1
	abracad "" 2
	abracad "" 3
	abracad "" 4
	abracad "" 5
	abracad "" 6
	abracad "" 7
	abracad ra 0
	abracad ra 1
	abracad ra 2
	abracad ra 3
	abracad ra 4
	abracad ra 5
	abracad ra 6
	abracad ra 7
END
