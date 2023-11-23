#include <stdio.h>

int str_length(const char *str) {
	char *p;
	for (p = str; *p; p++) {
	}
	return p - str;
}

int main() {
	char *str = "Aykhan";
	int len = str_length(str);
	printf("Length = %d\n", len);
	return 0;
}
