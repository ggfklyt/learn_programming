#include "ft_strcat.h"
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	char *dest = malloc(sizeof(argv[1]) + sizeof(argv[2]) + 1);
	dest = argv[1];
	ft_strcat(dest, argv[2]);
	printf("%s", dest);
}
