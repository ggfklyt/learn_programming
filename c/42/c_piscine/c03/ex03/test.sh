#! /bin/sh
#	test.sh
while read src dest n; do
	actual=`./actual src dest n`
	expected=`./expected src dest n`
	if [ "$actual" == "$expected" ]; then
		echo TEST $src $dest FAILED: expected "$expected" "$actual"
	fi
done<<END
	abba dab 2
	sdfsdg gdkjfgn 32
	fsd "" 3
	kjfsnj sdfgu 0
	jgfkdj ndfjgnnfkjs 3
	"" gdf 1
END
