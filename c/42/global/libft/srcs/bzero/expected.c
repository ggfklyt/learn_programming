#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

int main(int argc, char **argv)
{
	int slen = strlen(argv[1]);
	int n = atoi(argv[2]);
	void *dst = malloc((slen > n ? slen : n) + 1);
	bzero(dst, n);
	printf("%c", *(char *) dst);
}
