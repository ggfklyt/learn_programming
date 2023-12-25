#include <stdio.h>
#include "ft_strrchr.h"

int main(int argc, char **argv)
{
	char *res = ft_strrchr(argv[1], *argv[2]);
	printf("%s", res);
}
