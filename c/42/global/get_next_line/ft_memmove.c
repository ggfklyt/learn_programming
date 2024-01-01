#include <stdlib.h>

void *ft_memmove(void *dst, const void *src, size_t len)
{
	char *dstcp = (char *) dst;
	char *srccp = (char *) src;
	while (len) {
		*dstcp = *srccp;
		dstcp++;
		srccp++;
		len--;	
	}
	return dst;
}
