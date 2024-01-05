#ifndef BUFFER_SIZE 
# define BUFFER_SIZE 5
#endif

#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>

char 	*get_next_line(int fd);
size_t 	ft_strlcat(char * restrict dst, const char * restrict src, size_t dstsize);
size_t 	ft_strlen(const char *s);
char 	*ft_strchr(const char *s, int c);
size_t 	ft_strlcpy(char *restrict dst, const char *restrict src, size_t dstsize);
