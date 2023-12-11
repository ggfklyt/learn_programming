#include <stdio.h>
#include <stdlib.h>
#include "parse_int_from_string.h"
#include "ft_strncat.h"

int main(int argc, char **argv)
{
	char *dest1 = malloc(sizeof(argv[1]) + sizeof(argv[2]) + 1);
	char *dest = dest1;
	while (*argv[1]) {
		*dest1 = *argv[1];
		dest1++;
		argv[1]++;
	}
	*dest1 = '\0';
	ft_strncat(dest, argv[2], parse_int_from_string(argv[3]));
	printf("%s", dest);
}
