#include <stdio.h>
#include "string.h"
#include "ft_strcmp.h"

int main(int argc, char **argv)
{
	int res = ft_strcmp(argv[1], argv[2]);
	printf("%d", res);
	return 0;
}
