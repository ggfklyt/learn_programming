#include <stdio.h>
#include <stdlib.h>

struct item {
	int data;
	struct item *next;
};

struct item *int_array_to_list_reversed(int *array, int len);

int main() {
	int array[] = {1, 2, 3};
	int size = sizeof(array) / sizeof(int);
	struct item *list = int_array_to_list_reversed(array, size);
	while (list) {
		printf("%d ", list->data);
		list = list->next;
	}
}

struct item *int_array_to_list_reversed(int *array, int len) {
	struct item *first = NULL, *tmp;

	for (int i = 0; i < len; i++) {
		tmp = malloc(sizeof(struct item));
		tmp->data = array[i];
		tmp->next = NULL;
		if (first) {
			tmp->next = first;
			first = tmp;
		} else {
			first = tmp;
		}
	}
	return first;
}
