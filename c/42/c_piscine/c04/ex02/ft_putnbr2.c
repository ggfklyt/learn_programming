#include <unistd.h>

void putchar(char c)
{
	write(1, &c, 1);
}

void ft_putnbr(int nb)
{
	if (nb > 0) {
		ft_putnbr(nb / 10);
		putchar(nb);
	}
}
