#include "libft.h"

char *ft_strnstr(const char *haystack, const char *needle, size_t len)
{
	if (*needle == '\0') return (char *) haystack;

	char *haystackcp = (char *) haystack;
	size_t needle_len = ft_strlen(needle);
	while (len >= needle_len && *haystackcp) {
		if (!ft_strncmp(haystackcp, needle, needle_len))
			return haystackcp;
		haystackcp++;
		len--;
	}
	return NULL;
}
