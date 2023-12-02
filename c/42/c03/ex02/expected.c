#include <stdio.h>
#include <string.h>
#include <stdlib.h>

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
	char *res = strcat(dest, argv[2]);
	printf("%s", res);
	return 0;
}
