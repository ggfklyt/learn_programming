#include <stdio.h>
#include "ft_atoi.h"
#include <string.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	char *dst = malloc(strlen(argv[1]) + strlen(argv[2]) + 1);
	char *tmp = dst;
	while (*argv[1]) {
		*tmp = *argv[1];
		tmp++;
		argv[1]++;
	}
	*tmp = '\0';
	size_t res = strlcat(dst, argv[2], ft_atoi(argv[3]));
	printf("%s %lu", dst, res);
}
