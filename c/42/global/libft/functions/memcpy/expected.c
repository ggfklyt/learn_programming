#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int dstlen = strlen(argv[1]);
	int srclen = strlen(argv[2]);
	size_t n = atoi(argv[3]);
	char *dst = malloc((dstlen > n ? dstlen : n) + 1);
	memcpy(dst, argv[2], n);
	printf("%s", dst);
}
