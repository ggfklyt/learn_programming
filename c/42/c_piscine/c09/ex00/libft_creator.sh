#! /bin/sh -e
gcc -c *c
ar cr libft.a *.o
ranlib libft.a
