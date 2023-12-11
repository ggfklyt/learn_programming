int ft_strncmp(char *s1, char *s2, unsigned int n)
{
	int not_equal = 0;
	int i = 0;
	while (i++ < n && !not_equal && (*s1 || *s2)) {
		not_equal = *s1 - *s2;
		s1++;
		s2++;
	}
	return not_equal;
}
