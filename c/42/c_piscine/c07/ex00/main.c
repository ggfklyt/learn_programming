#include <stdio.h>
#include "ft_strdup.h"

int main(int argc, char **argv)
{
	char *res = ft_strdup(argv[1]);
	printf("%s", res);
}
