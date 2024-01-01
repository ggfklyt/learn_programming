#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include "get_next_line_utils.h"

#define BUFFER_SIZE 2

static int ft_strcpy(char *dst, char *src)
{
	int count = 0;
	while (*src) {
		*dst = *src;
		dst++;
		src++;
		count++;
	}
	*dst = '\0';
	return count;
}

static char *resize(char *s, int len, int *size)
{
	printf("resize(s=%s, len=%d, size=%d)\n", s, len, *size);
	int newsize = len / BUFFER_SIZE * BUFFER_SIZE * 2 + 1;
	printf("Old line size was %d. New line size is gonna be %d\n", *size, newsize);
	char *scp = malloc(newsize * sizeof(char));
	printf("memory for scp has allocated\n");
	ft_strcpy(scp, s);
	printf("resized line is %s\n", scp);
	*size = newsize;
	printf("Resizing has finished\n");
	free(s);
	printf("Old line was freed\n");
	return scp;
}

static char *cp_buf_to_line(char *line, int *lncurpos, int *lnsize, char *buf, int len)
{
	printf("lncurpos = %d lnsize = %d\n", *lncurpos, *lnsize);
	if (*lncurpos + len > *lnsize - 1) {
		printf("Need resize\n");
		printf("Line before resizing %s\n", line);
		line = resize(line, *lncurpos, lnsize);
		printf("Line after resizing %s\n", line);
	}
	printf("Concatenating line=%s buf=%s linesize = %d\n", line, buf, ft_strlen(line) + len + 1);
	ft_strlcat(line, buf, ft_strlen(line) + len + 1);
	printf("line = %s AFTER CONCAT\n", line);
	*lncurpos += len;
	return line;	
}

static int ft_strnchr(char *s, int c, size_t len)
{
	while (len) {
		if (*s == c)
			return 1;
		s++;
		len--;
	}
	return 0;
}

char *get_next_line(int fd)
{
	char *line = malloc((BUFFER_SIZE + 1) * sizeof(char));
	int lnsize = BUFFER_SIZE + 1;
	int lncurpos = 0;
	line[lncurpos] = '\0';
	char *buf = malloc((BUFFER_SIZE + 1) * sizeof(char));
	int bytes_read = 0;
	while ((bytes_read = read(fd, buf, BUFFER_SIZE)) > 0) {
		printf("bytes_read = %d\n", bytes_read);
		*(buf + bytes_read) = '\0';
		printf("buf = %s\n", buf);
		line = cp_buf_to_line(line, &lncurpos, &lnsize, buf, bytes_read);
		printf("line = %s\n", line);
		if (ft_strnchr(buf, '\0', BUFFER_SIZE))
			break;
	}
	return lncurpos == 0 ? NULL : line;
}
