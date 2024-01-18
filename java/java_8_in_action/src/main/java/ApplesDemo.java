import java.util.List;
import java.util.Arrays;

public class ApplesDemo {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple[] {
                new Apple("green"),
                new Apple("red"),
                new Apple("black")
        });
    }
}

class Apple {
    static int counter = 0;
    int id;
    String color;

    public Apple(String color) {
        this.id = counter++;
        this.color = color;
    }

}