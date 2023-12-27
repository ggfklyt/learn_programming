#include <stdio.h>
#include "ft_memmove.h"
#include "ft_atoi.h"

int main(int argc, char **argv)
{
	ft_memmove(argv[1], argv[1] + 2, ft_atoi(argv[2]));
	printf("%s", argv[1]);
}
