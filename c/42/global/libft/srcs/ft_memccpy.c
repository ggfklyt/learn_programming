#include <stdlib.h>

void *ft_memccpy(void *restrict dst, const void *restrict src, int c, size_t n)
{
	char *dstcp = (char *) dst;
	char *srccp = (char *) src;
	while (n) {
		*dstcp = *srccp;
		if (*srccp == c)
			break;
		dstcp++;
		srccp++;
		n--;
	}
	return dst;
}
