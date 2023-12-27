#include <stdlib.h>

char *ft_strchr(const char *s, int c)
{
	char *scp = (char *) s;
	while (*scp) {
		if (*scp == c)
			return scp;
		scp++;
	}
	return NULL;
}
