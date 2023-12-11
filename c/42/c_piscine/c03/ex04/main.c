#include <stdio.h>
#include "ft_strstr.h"

int main(int argc, char **argv)
{
	char *res = ft_strstr(argv[1], argv[2]);
	printf("%s", res);
	return 0;
}
