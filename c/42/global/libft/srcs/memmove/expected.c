#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{
	//int dstlen = strlen(argv[1]);
	size_t len = atoi(argv[2]);
	//void *dst = malloc((dstlen > len ? dstlen : len) + 1);
	memmove(argv[1], argv[1] + 2, len);
	printf("%s", (char *) argv[1]);
}
