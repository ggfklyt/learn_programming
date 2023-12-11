char *ft_strncpy(char *dest, char *src, unsigned int n)
{
	int cnt = 0;
	while ((cnt < n) && *src) {
		*dest = *src;
		src++;
		dest++;
		cnt++;
	}
	while (cnt < n) {
		*dest = '\0';
		dest++;
		cnt++;
	}
	return dest;
}
