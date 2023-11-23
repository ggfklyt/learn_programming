#include <stdio.h>

int count_spaces(const char *s) {
	int count = 0;
	while (*s) {
		if (*s++ == ' ') {
			count++;
		}
	}
	return count;
}

int main() {
	char *s = "Aykhan please do it";
	int result = count_spaces(s);
	printf("There are %d spaces in the string\n", result);
	return 0;
}
