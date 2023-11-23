#include <stdio.h>

int get_and_zero(int *n) {
	int res = *n;
	*n = 0;
	return res;
}

int main() {
	int n = 5;
	int res = get_and_zero(&n);
	printf("res_and_get result is %d\n", res);
	printf("argument n has value %d\n", n);
	return 0;
}
