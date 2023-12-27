#include <stdlib.h>

void *ft_memcpy(void *restrict dst, const void *restrict src, size_t n)
{
	char *dstcp = (char *) dst;
	char *srccp = (char *) src;
	while (n) {
		*dstcp = *srccp;
		dstcp++;
		srccp++;	
		n--;
	}
	return dst;
}
