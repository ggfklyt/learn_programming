#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int res = memcmp(argv[1], argv[2], atoi(argv[3]));
	printf("%d", res);
}
