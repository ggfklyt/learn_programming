TARGET=wolf3d
CC=gcc
CFLAGS=-c -Wall -Wextra -Werror
MLX_DIR=mlx
SRCS=*.c
OBJS=$(patsubst *.c, *.o, SRCS)

all: $(TARGET)

$(TARGET): $(OBJS)
	$(CC) $(OBJ) -L$(MLX_DIR) -l$(MLX_DIR) -framework OpenGL -framework Appkit -o $(TARGET)

%.o: %.c
	$(CC) $(CFLAGS) -I$(MLX_DIR) $< -o $@

clean:
	rm *.o $(TARGET)
