#include "ft_putnbr.h"
#include "parse_int_from_string.h"

int main(int argc, char **argv)
{
	ft_putnbr(parse_int_from_string(argv[1]));
}
