#include <stdio.h>
#include "ft_range.h"
#include "parse_int_from_string.h"

int main(int argc, char **argv)
{
	int *ar = ft_range(parse_int_from_string(argv[1]), parse_int_from_string(argv[2]));
	if (ar != NULL) {
		while (*ar) {
			printf("%d ", *ar);
			ar++;
		}
	}
}
