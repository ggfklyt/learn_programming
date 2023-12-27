#include <stdlib.h>

void *ft_memchr(const void *s, int c, size_t n)
{
	char *scp = (char *) s;
	while (*scp && n--) {
		if (*scp == c)
			return scp;
		scp++;
	}
	return NULL;
}
