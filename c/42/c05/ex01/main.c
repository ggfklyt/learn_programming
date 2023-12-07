#include <stdio.h>
#include "ft_recursive_factorial.h"
#include "parse_int_from_string.h"

int main(int argc,  char **argv)
{
	printf("%d", ft_recursive_factorial(parse_int_from_string(argv[1])));
}
