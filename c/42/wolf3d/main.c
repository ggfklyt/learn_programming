#include "minilibx/mlx.h"

int main()
{
	void	*mlx;
	void	*mlx_window;
	mlx = mlx_init();
	mlx_window = mlx_new_window(mlx, 500, 500, "My first Window");
	mlx_loop(mlx);
}
