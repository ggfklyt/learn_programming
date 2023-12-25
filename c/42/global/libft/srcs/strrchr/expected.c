#include <stdio.h>
#include <string.h> 

int main(int argc, char **argv)
{
	char *res = strrchr(argv[1], *argv[2]);
	printf("%s", res);
}
