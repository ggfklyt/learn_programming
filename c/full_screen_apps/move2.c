#include <curses.h>
#include <stdio.h>

const char message[] = "Hello, world!";
enum { escape_character = 27 };

static void show_message(int x, int y)
{
//	printf("I'm printing message\n");
	move(y, x);
	addstr(message);
	curs_set(0);
	refresh();
}

static void hide_message(int x, int y)
{
//	printf("I'm hiding message\n");
	move(y, x);
	for (int i = 0; i < sizeof(message); i++) {
		addch(' ');
	}
}

static void check(int *x, int *y, int x_max, int y_max, int dx, int dy)
{
//	printf("I'm checking message\n");
	if (*x + dx > x_max) {
	//	printf("x = x_max\n");
		*x = x_max;
	} else if (*x + dx < 0) {
		*x = 0;
	} else {
		*x += dx;
	}
	if (*y + dy > y_max) {
	//	printf("y = y_max\n");
		*y = y_max;
	} else if (*y + dy < 0) {
		*y = 0;
	} else {
		*y += dy;
	}
}

static void move_message(int *x, int *y, int x_max, int y_max, int dx, int dy)
{
//	printf("I'm moving message\n");
	hide_message(*x, *y);
	check(x, y, x_max, y_max, dx, dy);
	show_message(*x, *y);
}

static void handle_resize(int *x, int *y) {
	int col, row, ma
	getmaxyx(srdscr, row, col)
}

int main() 
{
	int col, row, max_x, max_y, x, y, c;
	initscr();
	noecho();
	keypad(stdscr, 1);
	getmaxyx(stdscr, row, col);
	max_x = col - sizeof(message) + 1;
	max_y = row - 1;
	x = (col - sizeof(message) - 1) / 2;
	y = row / 2;
	show_message(x, y);
	while ((c = getch()) != escape_character) {
		switch(c) {
			case KEY_UP:
				move_message(&x, &y, max_x, max_y, 0, -1);
				break;
			case KEY_DOWN:
				move_message(&x, &y, max_x, max_y, 0, 1);
				break;
			case KEY_LEFT:
				move_message(&x, &y, max_x, max_y, -1, 0);
				break;
			case KEY_RIGHT:
				move_message(&x, &y, max_x, max_y, 1, 0);
				break;
			case KEY_RESIZE:
				handle_resize();
				break;
		}
	}
	endwin();
	return 0;
}
