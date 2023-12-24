#include <stdio.h>
#include <stdlib.h>
#include "ft_strlen.h"
#include "ft_atoi.h"
#include "ft_memccpy.h"

int main(int argc, char **argv)
{
	int dstlen = ft_strlen(argv[1]);
	int n = ft_atoi(argv[4]);
	void *dst = malloc((dstlen > n ? dstlen : n) + 1);
	ft_memccpy(dst, argv[2], (int) *argv[3], n);
	printf("%s", (char *)dst);
}
