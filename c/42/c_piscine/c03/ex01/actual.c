#include <stdio.h>
#include "ft_strncmp.h"

int main(int argc, char **argv)
{
	int res = ft_strncmp(argv[1], argv[2], (int)*argv[3]);
	printf("%d", res);
}
