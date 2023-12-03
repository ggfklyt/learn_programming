#include <stddef.h>

char *ft_strstr(char *str, char *to_find)
{
	while (*str) {
		if (*str == *to_find) {
			char *begin = str;
			char *cur_str = str;
			char *cur_to_find = to_find;
			while (*cur_str && *cur_to_find && *cur_str == *cur_to_find) {
				cur_str++;
				cur_to_find++;
			}
			if (!*cur_to_find) {
				return begin;
			}
		}
		str++;
	}
	return NULL;
}
