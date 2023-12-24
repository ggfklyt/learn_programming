#include <stdlib.h>

void *ft_memset(void *b, int c, size_t len)
{
	char *tmp = (char *) b;
	while (len) {
		*tmp = (char) c;
		tmp++;
		len--;
	}
	return b;
}
