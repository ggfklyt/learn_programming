#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv)
{
	printf("%c", toupper(*argv[1]));
}
