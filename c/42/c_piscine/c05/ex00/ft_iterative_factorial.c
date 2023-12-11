int ft_iterative_factorial(int nb)
{
	if (nb == 0 || nb == 1) return 1;
	int res = 1;
	for (int i = 1; i <= nb; i++) {
		res *= i;
	}
	return res;
}
