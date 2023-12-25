#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{
	char *res = strnstr(argv[1], argv[2], atoi(argv[3]));
	printf("%s", res);
}
