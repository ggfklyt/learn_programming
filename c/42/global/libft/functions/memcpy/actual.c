#include <stdio.h>
#include <stdlib.h>
#include "ft_memcpy.h"
#include "ft_strlen.h"
#include "ft_atoi.h"

int main(int argc, char **argv)
{
	int dstlen = ft_strlen(argv[1]);
	size_t n = ft_atoi(argv[3]);
	char *dst = malloc((dstlen > n ? dstlen : n) + 1);
	ft_memcpy(dst, argv[2], n);
	printf("%s", dst);
}
