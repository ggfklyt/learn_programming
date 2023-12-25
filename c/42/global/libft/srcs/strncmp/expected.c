#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argvc, char **argv)
{
	int res = strncmp(argv[1], argv[2], atoi(argv[3]));
	printf("%d", res);
}
