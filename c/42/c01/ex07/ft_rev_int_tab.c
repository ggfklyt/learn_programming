void ft_rev_int_tab(int *tab, int size)
{
	int first = 0;
	int last = size - 1;
	int tmp;
	while (first < last) {
		tmp = tab[first];	
		tab[first++] = tab[last];
		tab[last--] = tmp;
	}
}
