char *ft_strncat(char *dest, char *src, unsigned int nb)
{
	while (*dest) {
		dest++;
	}
	int cnt = 0;
	while (cnt < nb && *src) {
		*dest = *src;
		dest++;
		src++;
	}
	*dest = '\0';
	return dest;
}
