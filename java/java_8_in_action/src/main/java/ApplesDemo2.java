import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class ApplesDemo2 {
    public static <T extends Apple> List<T> filter(Collection<T> apples, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T apple: apples) {
            if (condition.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple[] {
                        new Apple("Red", 102),
                        new Apple("Green", 103),
                        new Apple("Red", 152)
                });
        List<Apple> redApples = filter(apples, a -> a.color == "Red");
        List<Apple> greenApples = filter(apples, a -> a.color == "Green");
        List<Apple> heavyApples = filter(apples, a -> a.weight > 150);

        System.out.println("Green apples:");
        for (Apple a: greenApples)
            System.out.println(a);

        System.out.println("Red apples:");
        for (Apple a: redApples)
            System.out.println(a);
        System.out.println("Green apples:");
        for (Apple a: greenApples)
            System.out.println(a);
        System.out.println("Heavy apples:");
        for (Apple a: heavyApples)
            System.out.println(a);
    }
}