#include <stdlib.h>
#include "ft_strlen.h"

size_t ft_strlcpy(char *restrict dst, const char *restrict src, size_t dstsize)
{
	char *dstcp = (char *) dst;
	char *srccp = (char *) src;
	size_t initial_dstsize = dstsize;
	while ((dstsize > 1) && *srccp) {
		*dstcp = *srccp;
		dstcp++;
		srccp++;
		dstsize--;
	}
	if (initial_dstsize != 0)
		*dstcp = '\0';
	return ft_strlen(src);
}
