#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

char *get_next_line(int fd)
{
	char *buffer = malloc(120);
	int n = read(fd, buffer, 120);
	printf("%s", buffer);
	return buffer;
}
