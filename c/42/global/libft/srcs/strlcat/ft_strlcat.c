#include <stdlib.h>
#include "ft_strlen.h"

size_t ft_strlcat(char * restrict dst, const char * restrict src, size_t dstsize)
{
	size_t res = ft_strlen(dst) + ft_strlen(src);
	int append_size = dstsize  - ft_strlen(dst) - 2;
	while (*dst) {
		dst++;
	}
	while (append_size > 0)
	{
		*dst = *src;
		dst++;
		src++;
		append_size--;
	}
	*dst = '\0';
	return res;
}
