#include "libft.h"

size_t ft_strlcat(char * restrict dst, const char * restrict src, size_t dstsize)
{
	size_t srclen = ft_strlen(src);
	size_t dstlen = ft_strlen(dst);
	size_t res = srclen + (dstsize > dstlen ? dstlen : dstsize);
	int append_size = dstsize  - dstlen - 1;
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
