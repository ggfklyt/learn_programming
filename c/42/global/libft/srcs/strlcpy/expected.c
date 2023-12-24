#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{
	char *dst = malloc(strlen(argv[1]) + strlen(argv[2]) + 1);
	char *dstcp = dst;
	while (*argv[1]) {
		*dstcp = *argv[1];
		dstcp++;
		argv[1]++;
	}
	*dstcp = '\0';
	size_t res = strlcpy(dst, argv[2], atoi(argv[3]));
	printf("%lu %s", res, dst);
}
