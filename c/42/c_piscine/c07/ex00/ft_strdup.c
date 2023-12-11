#include <stdlib.h>

char *ft_strdup(char *src)
{
	int len = 0;
	char *cur = src;
	while (*cur) {
		len++;
		cur++;
	}
	char *res = malloc(len + 1);
	char *copy = res;
	while (*src) {
		*copy = *src;
		copy++;
		src++;
	}
	*copy = '\0';
	return res;
}
