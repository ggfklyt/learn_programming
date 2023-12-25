#include "ft_isdigit.h"

int ft_atoi(const char *str)
{
	if (!ft_isdigit(*str) && *str != '-' && *str != '+') {
		return 0;
	}
	int n = 0;
	int sign = 1;
	if (*str == '-' || *str == '+') {
		sign = *str == '-'? -1 : 1;
		str++;
	}
	while(ft_isdigit(*str)) {
		n = n * 10 + *str - '0';
		str++;
	}
	return n * sign;
}
