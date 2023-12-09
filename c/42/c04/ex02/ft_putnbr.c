#include <unistd.h>

void putchar(char c)
{
	write(1, &c, 1);
}

void ft_putnbr(int nb)
{
	int n = 0;
	int cnt = 0;
	while (nb > 0) {
		cnt = 0;
		n = nb;
		while (n > 10) {
			n /= 10;
			cnt++;
		}
		putchar(n + '0');
		if (cnt > 0) {
			int minus = 1;
			while (cnt > 0) {
				minus *= 10;
				cnt--;
			}
			nb -= minus * n;
		} else {
			nb -= n;
		}
	}
	
}
