#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int dstlen = strlen(argv[1]);
	size_t n = atoi(argv[4]);
	void *dst = malloc((dstlen > n ? dstlen : n) + 1);
	memccpy(dst, argv[2], (int) *argv[3], n);
	printf("%s", (char *) dst);
}
