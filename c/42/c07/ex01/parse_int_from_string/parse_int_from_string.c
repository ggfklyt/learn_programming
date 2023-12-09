int parse_int_from_string(char *s)
{
	int num = 0;
	while (*s) {
		num = num * 10 + *s - '0';
		s++;
	}
	return num;
}
