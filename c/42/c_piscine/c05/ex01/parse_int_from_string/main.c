#include "parse_int_from_string.h"
#include <stdio.h>

int main(int argc, char **argv)
{
	int res = parse_int_from_string(argv[1]);
	printf("%d", res);
	return 0;
}
