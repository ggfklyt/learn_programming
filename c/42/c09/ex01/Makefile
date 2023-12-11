CC=gcc
CFLAGS=-c -Wall -Wextra -Werror
SRC_DIR=srcs
SRCS=$(wildcard $(SRC_DIR)/*.c)
OBJS=$(patsubst %.c, %.o, $(SRCS))
TARGET=libft.a

all: $(TARGET)

$(TARGET): $(OBJS)
	echo $(SRCS)
	echo $(OBJS)
	ar rcs $(TARGET) $?

clean:
	rm $(OBJS) $(TARGET) 
