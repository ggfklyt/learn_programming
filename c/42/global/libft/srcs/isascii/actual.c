#include <stdio.h>
#include "ft_isascii.h"

int main(int argc, char **argv)
{
	printf("%d", ft_isascii(*argv[1]));
}
