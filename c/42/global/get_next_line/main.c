#include "get_next_line_utils.h"

int main() {
	int fd = open("map.txt", O_RDONLY);
	char *line = NULL;
	int number = 1;
	while ((line = get_next_line(fd))) {
		printf("line №%d=\"%s\"\n", number++, line);
		close(fd);
		free(line);
	}
	return 0;
}
