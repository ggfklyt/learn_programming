#include <stdio.h>
#include "ft_atoi.h"
#include "ft_memchr.h"

int main(int argc, char **argv)
{
	char *res = ft_memchr(argv[1], *argv[2], ft_atoi(argv[3]));
	printf("%s", res);
}
