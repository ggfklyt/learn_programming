#include <stdio.h>
#include "ft_atoi.h"
#include "ft_memcmp.h"

int main(int argc, char **argv)
{
	int res = ft_memcmp(argv[1], argv[2], ft_atoi(argv[3]));
	printf("%d", res);
}
