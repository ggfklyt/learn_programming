#include "minilibx/mlx.h"
#include <stdlib.h>
#include <time.h>

#define WIDTH 600
#define HEIGHT 600
int main()
{
	void	*mlx_connection;
	void	*mlx_window;

	srand(time(NULL));
	mlx_connection = mlx_init();
	mlx_window = mlx_new_window(mlx_connection,
					WIDTH,
					HEIGHT,
					"My 1* window");
	for (int y = 0.1 * HEIGHT; y < HEIGHT * 0.9; ++y) 
	{
		for (int x = 0.1 * WIDTH; x < WIDTH * 0.9; ++x)
		{
			mlx_pixel_put(mlx_connection,
				mlx_window,
				x,
				y,
				rand() % 0x1000000);
		}
	}
	mlx_string_put(mlx_connection,
			mlx_window,
			WIDTH * 0.75,
			HEIGHT * 0.95,
			rand() % 0x1000000,
			"ggfklyt");
	mlx_loop(mlx_connection);
}
