#include <stdlib.h>

char *strnstr(const char *haystack, const char *needle, size_t len)
{
	char *haystackcp = (char *) haystack;
	char *needlecp = (char *) needle;
	while (len && *haystackcp && *needlecp) {

		len--;
	}
}
