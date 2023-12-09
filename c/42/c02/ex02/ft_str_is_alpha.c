int ft_str_is_alpha(char *str)
{
	int is_alpha = 1;
	while (is_alpha && *str) {
		if (!(*str >= 'a' && *str <= 'z' || *str >= 'A' && *str <= 'Z')) {
			is_alpha = 0;
		}
		str++;
	}
	return is_alpha;
}
