#include <ctype.h>
#include <stdio.h>

int main(int argc, char **argv)
{
	printf("%d", isdigit(*argv[1]));

}
