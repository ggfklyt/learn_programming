#include <stdio.h>
#include "ft_strlen.h"
#include "ft_atoi.h"
#include "ft_bzero.h"
#include <stdlib.h>

int main(int argc, char **argv)
{
	int slen = ft_strlen(argv[1]);
	int n = ft_atoi(argv[2]);
	char *dst = malloc((slen > n ? slen : n) + 1);
	ft_bzero(dst, n);
	printf("%s", dst);
}
