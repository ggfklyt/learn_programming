#include <stdlib.h>

int ft_memcmp(const void *s1, const void *s2, size_t n)
{
	char *s1cp = (char *) s1;
	char *s2cp = (char *) s2;
	while (n && *s1cp && *s2cp && *s1cp == *s2cp) {
		s1cp++;
		s2cp++;
		n--;
	}
	return n > 0 ? *s1cp - *s2cp : 0;
}
