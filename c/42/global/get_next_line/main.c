#include "get_next_line.h"
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
	int fd = open("map.txt", O_RDONLY);
	char *line = NULL;
	while (NULL != (line = get_next_line(fd))) { 
		printf("%s\n", line);
	}
	close(fd);
}
