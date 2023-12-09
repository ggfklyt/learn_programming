#include <unistd.h>

void ft_print_comb()
{
	char a = '0';
	while (a <= '9') {
		write(1, &a, 1);
		char b = a + 1;
		while (b <= '9') {
			write(1, &b, 1);
			char c = b + 1;
			while (c <= '9') {
				write(1, &c, 1);
				c++;
				write(1, ", ", 2);
			}
			b++;
		}
		a++;
	}
}
