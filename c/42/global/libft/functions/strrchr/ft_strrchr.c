#include <stdlib.h>

char *ft_strrchr(const char *s, int c)
{
	char *scp = (char *) s;
	char *last = NULL;
	while (*scp) {
		if (*scp == c)
			last = scp;
		scp++;
	}
	return last;
}
