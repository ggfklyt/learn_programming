#include <unistd.h>

void ft_print_numbers()
{
	int c = '0';
	while (c <= '9') {
		write(1, &c, 1);
		c++;
	}
}
