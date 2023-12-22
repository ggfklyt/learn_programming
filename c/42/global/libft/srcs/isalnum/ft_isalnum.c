#include "ft_isdigit.h"
#include "ft_isalpha.h"

int ft_isalnum(int c)
{
	return ft_isdigit(c) || ft_isalpha(c);
}
