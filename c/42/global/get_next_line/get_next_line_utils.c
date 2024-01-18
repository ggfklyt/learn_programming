#include "get_next_line.h"

size_t ft_strlcat(char * restrict dst, const char * restrict src, size_t dstsize)
{
	size_t srclen = ft_strlen(src);
	size_t dstlen = ft_strlen(dst);
	size_t res = srclen + ((dstsize > dstlen) ? dstlen : dstsize);
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

size_t ft_strlen(const char *s)
{
	size_t len = 0;
	while (*s++)
		len++;
		
	return len;
}

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
