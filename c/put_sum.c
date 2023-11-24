#include <stdio.h>

int put_sum(int *a, int *b, int *c) {
	int sum = *a + *b + *c;
	*a = sum;
	*b = sum;
	*c = sum;
	return sum;
}

int main() {
	int a, b, c;
	printf("Please input 3 numbers:\n");
	scanf("%d%d%d", &a, &b, &c);
	int sum = put_sum(&a, &b, &c);
	printf("Sum is %d\n", sum);
	printf("Arguments now are: %d %d %d\n", a, b, c);
	return 0;
}
