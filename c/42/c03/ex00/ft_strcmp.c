int ft_strcmp(char *s1, char *s2)
{
	int are_not_equal = 0;
	while (!are_not_equal && (*s1 || *s2)) {
		are_not_equal = *s1 - *s2;
		s1++;
		s2++;
	}
	return are_not_equal;

}
