#include "string.h"
#include <stdio.h>

int main(int argc, char **argv)
{
	printf("%d", strncmp(argv[1], argv[2], *argv[3]));
	return 0;
}
