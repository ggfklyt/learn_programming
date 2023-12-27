#include <ctype.h>
#include <stdio.h>

int main(int argc, char **argv)
{
	printf("%d", isascii(*argv[1]));
}
