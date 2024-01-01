#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include "get_next_line_utils.h"

#define BUFFER_SIZE 3

static char *resize(char *s, int size)
{
	free(s);
	s = malloc(size);
	return s;
}

static void cp_buf_to_line(char *dst, int *dstpos, int *dstsize, char *src, int len)
{
	if (*dstpos + len > *dstsize) {
		resize(src, *dstpos + len);
	}
	ft_memmove(dst + *dstpos, src, len);
	*dstpos += len;
}

static int ft_strnchr(char *s, int c, size_t len)
{
	while (len) {
		if (*s == c)
			return 1;
		len--;
	}
	return 0;
}

char *get_next_line(int fd)
{
	char *line = malloc(BUFFER_SIZE);
	int lnsize = BUFFER_SIZE;
	int lncurpos = 0;
	char *buf = malloc(BUFFER_SIZE);
	int bytes_read = 0;
	while ((bytes_read = read(fd, buf, BUFFER_SIZE)) > 0 && !ft_strnchr(buf, '\0', BUFFER_SIZE)) {
		cp_buf_to_line(line, &lncurpos, &lnsize, buf, bytes_read);
		printf("bytes_read = %d\n", bytes_read);	
	}
	return lncurpos == 0 ? NULL : line;
}
