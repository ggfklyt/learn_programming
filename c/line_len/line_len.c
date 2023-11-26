#include <stdio.h>

int main() {
	int c;
	int len = 0;
	while ((c = getchar()) != EOF) {
		if (c == '\n') {
			printf("Line length is %d\n", len);
			len = 0;
		} else {
			len++;
		}
	}
	return 0;
}
