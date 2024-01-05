#include "get_next_line_utils.h"

char *ft_strjoin(const char *s1, const char *s2) {
	char *res = malloc((s1 ? ft_strlen(s1) : 0) + (s2 ? ft_strlen(s2) : 0) + 1);
	char *rescp = res;
	if (!res)
		return 0;
	if (NULL != s1) {
		while (*s1) {
			*rescp = *s1;
			rescp++;
			s1++;
		}
	}
	if (NULL != s2) {
		while (*s2) {
			*rescp = *s2;
			rescp++;
			s2++;
		}
	}
	*rescp = '\0';
	return res;
}

char *get_next_line(int fd)
{
	if ((BUFFER_SIZE < 0) || read(fd, NULL, 0) < 0)
		return NULL;
	char *nlptr = NULL;
	char *buf = malloc(BUFFER_SIZE + 1);
	if (!buf)
		return 0;
	char *line = NULL;
	char *new_line = NULL;
	int count = 0;
	char *str_before_nl = NULL;
	static char *rem = NULL;
	char *new_rem = NULL;
	if (rem) {
		if ((nlptr = ft_strchr(rem, '\n'))) {
			str_before_nl = malloc(nlptr - rem + 2);
			ft_strlcat(str_before_nl, rem, nlptr - rem + 2);
			new_line = ft_strjoin(line, str_before_nl);
			free(str_before_nl);
			line = new_line;
			str_before_nl = NULL;
			if (ft_strlen(nlptr + 1) > 0) {
				new_rem = malloc(ft_strlen(nlptr + 1) + 1);
				ft_strlcpy(new_rem, nlptr + 1, ft_strlen(nlptr + 1) + 1);
				free(rem);
				rem = new_rem;
				new_rem = NULL;
			} else {
				free(rem);
				rem = NULL;
			}
		} else {
			line = rem;
			rem = NULL;
		}
	}
	while ((line ? !ft_strchr(line, '\n') : 1) && (count = read(fd, buf, BUFFER_SIZE)) > 0) {
		buf[BUFFER_SIZE] = '\0';
		if ((nlptr = ft_strchr(buf, '\n'))) {
			str_before_nl = malloc(nlptr - buf + 2); // 0123\n3\0
			ft_strlcat(str_before_nl, buf, nlptr - buf + 2);
			new_line = ft_strjoin(line, str_before_nl);
			rem = ft_strjoin(rem, nlptr + 1);
			free(line);
			free(str_before_nl);
			line = new_line;
			new_line = NULL;
			break;
		} else {
			new_line = ft_strjoin(line, buf);
			free(line);
			line = new_line;
			new_line = NULL;
		}
	}
	free(buf);
	buf = NULL;
	return line;
}
