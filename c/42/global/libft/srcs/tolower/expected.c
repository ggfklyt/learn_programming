#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv)
{
	printf("%d", tolower(*argv[1]));
}
