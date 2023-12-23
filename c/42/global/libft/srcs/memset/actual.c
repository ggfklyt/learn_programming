#include <stdio.h>
#include "ft_strlen.h"
#include "ft_atoi.h"
#include "ft_memset.h"

int main(int argc, char **argv)
{
	char *dst = malloc(ft_strlen(argv[1]) + ft_atoi(argv[3]) + 1);
	char *tmp = dst;
	while (*argv[1]) {
		*tmp = *argv[1];
		tmp++;
		argv[1]++;
	}
	*tmp = '\0';
	void *res = ft_memset((void *) argv[1], ft_atoi(argv[2]), ft_atoi(argv[3]));
	printf("%s", (char *) res);
}
