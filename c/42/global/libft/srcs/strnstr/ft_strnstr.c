#include <stdio.h>
#include <stdlib.h>
#include "ft_strncmp.h"
#include "ft_strlen.h"

char *ft_strnstr(const char *haystack, const char *needle, size_t len)
{
	if (*needle == '\0') return (char *) haystack;

	char *haystackcp = (char *) haystack;
	int needle_len = ft_strlen(needle);
	while (len >= needle_len && *haystackcp) {
		if (!ft_strncmp(haystackcp, needle, needle_len))
			return haystackcp;
		haystackcp++;
		len--;
	}
	return NULL;
}
