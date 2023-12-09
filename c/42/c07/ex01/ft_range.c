#include <stdlib.h>

int *ft_range(int min, int max)
{
	if (max < min) return NULL;
	int *res = malloc(max - min + 1);
	int *arr = res;
	while (min <= max) {
		*arr = min;
		min++;
		arr++;	
	}
	return res;
}
