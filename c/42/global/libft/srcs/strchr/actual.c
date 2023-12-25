#include <stdio.h>
#include "ft_strchr.h"

int main(int argc, char **argv)
{
	char *res = ft_strchr(argv[1], *argv[2]);
	printf("%s", res);
}
