#include <stdio.h>
#include <stdlib.h>
#include "ft_strlen.h"
#include "ft_atoi.h"
#include "ft_strlcpy.h"

int main(int argc, char **argv)
{
	char *dst = malloc(ft_strlen(argv[1]) + ft_strlen(argv[2]) + 1);
	char *dstcp = dst;
	while (*argv[1]) {
		*dstcp = *argv[1];
		dstcp++;
		argv[1]++;
	}
	*dstcp = '\0';
	size_t res = ft_strlcpy(dst, argv[2], ft_atoi(argv[3]));
	printf("%lu %s", res, dst);
}
