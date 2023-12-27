#include <stdio.h>
#include "ft_isprint.h"

int main(int argc, char **argv)
{
	printf("%d", ft_isprint(*argv[1]));
}
