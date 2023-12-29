NAME=libft.a
CC=gcc
CFLAGS=-c -Wall -Wextra -Werror
HEADER=libft.h
SRCS_DIR=srcs
SRCS=$(wildcard $(SRCS_DIR)/*.c)
OBJS_DIR=objs
OBJS=$(addprefix $(OBJS_DIR)/, $(patsubst %.c, %.o, $(notdir $(SRCS))))

all: $(NAME)

$(NAME): $(OBJS)
	ar -rcs libft.a $(OBJS)

$(OBJS_DIR)/%.o: $(SRCS_DIR)/%.c
	mkdir -p $(OBJS_DIR)
	$(CC) $(CFLAGS) $< -o $@

clean:
	rm $(OBJS) $(NAME)
