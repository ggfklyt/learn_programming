import java.util.List;
import java.util.Arrays;

public class ApplesDemo {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple[] {
                new Apple("green", 106),
                new Apple("red", 152),
                new Apple("black", 200)
        });

        for (Apple a: apples) {
            System.out.println(a);
        }
    }
}

class Apple {
    static int counter = 0;
    int id;
    String color;
    int weight;

    public Apple(String color, int weight) {
        this.id = counter++;
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        return "{id:" + id + ", color:" + color + ", weight:" + weight + "}";
    }

}