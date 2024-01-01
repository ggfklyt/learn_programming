#include "get_next_line.h"
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
	int fd = open("map.txt", O_RDONLY);
	char *line = NULL;
	int count = 1;
	while (NULL != (line = get_next_line(fd))) { 
		printf("line №%d=%s", count, line);
		count++;
	}
	close(fd);
}
