#include <stdio.h>

int count_spaces(const char *s);

int main() {
	char *s = "";
	int res = count_spaces(s);
	printf("Result is %d\n", res);
	return 0;
}

int count_spaces(const char *s) {
	if (!*s) {
		return 0;
	}
	return (*s == ' ') + count_spaces(++s);	
}
