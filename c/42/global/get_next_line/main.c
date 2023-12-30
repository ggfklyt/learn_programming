#include "get_next_line.h"
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

int main(int argc, char **argv)
{
	int fd = open("map.txt", O_RDONLY);
	printf("%d\n", fd);
	get_next_line(fd);
	close(fd);
}
