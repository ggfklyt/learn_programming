#include <ncurses.h>

int main() {
	initscr();
	bool work_bw = !has_colors();
	if (!work_bw)
		start_color();
}
