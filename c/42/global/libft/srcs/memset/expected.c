#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	char *dst = malloc(strlen(argv[1]) + atoi(argv[3]) + 1);
	char *tmp = dst;
	while (*argv[1]) {
		*tmp = *argv[1];
		tmp++;
		argv[1]++;
	}
	*tmp = '\0';
	void *res = memset((void *) dst, atoi(argv[2]), atoi(argv[3]));
	printf("%s", (char *)res);
}
