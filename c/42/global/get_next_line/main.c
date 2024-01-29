#include "get_next_line.h"

int main() {
	int fd = open("/Users/art/Desktop/learn_programming/c/42/global/get_next_line/gnl-war-machine-v2019/tests/default_Mr._Justice_Maxell_by_Edgar_Wallace.txt.output", O_RDONLY);
	char *line = NULL;
	while ((line = get_next_line(fd))) {
		//printf("line №%d=\"%s\"\n", number++, line);
		printf("1%s", line);
		free(line);
		line = NULL;
	}
	return 0;
}
