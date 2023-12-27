#include <stdio.h>
#include "ft_strnstr.h"
#include "ft_atoi.h"

int main(int argc, char **argv)
{
	char *res = ft_strnstr(argv[1], argv[2], ft_atoi(argv[3]));
	printf("%s", res);
}
