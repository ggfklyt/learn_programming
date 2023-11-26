#include <stdio.h>
#include <stdlib.h>

struct item {
	int data;
	struct item *next;
};

struct item *int_array_to_list(const int *arr, int len);

int main() {
	int array[] = {1, 2, 3};
	int len = sizeof(array) / sizeof(int);
	printf("Array length is %d\n", len);
	struct item *list = int_array_to_list(array, len);
	while (list) {
		printf("%d ", list->data);
		list = list->next;
	}
	return 0;
}

struct item *int_array_to_list(const int *arr, int len) {
	struct item *first = NULL, *last = NULL, *tmp;
	int i = 0;
	for (i = 0; i < len; i++) {
		tmp = malloc(sizeof(struct item));
		tmp->data = arr[i];
		tmp->next = NULL;
		if (last) {
			last->next = tmp;
			last = last->next;
		} else {
			first = last = tmp;
		}
	}
	return first;
}


