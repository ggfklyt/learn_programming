import java.util.Arrays;
import java.util.List;

public class ApplesDemo3 {
    public static void prettyPrintApple(List<Apple> apples, PrettyApple prettier) {
        for (Apple apple: apples) {
            System.out.println(prettier.pretty(apple));
        }
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple[] {
                        new Apple("Red", 102),
                        new Apple("Green", 100)
                }
        );
        //prettyPrintApple(apples, new AppleBetweenDollars());
        //prettyPrintApple(apples, new AppleBetweenExclamationPoints());
        prettyPrintApple(apples, new PrettyApple() {
            public String pretty(Apple apple) {
                return "!" + apple.toString() + "!";
            }
        });
    }
}



interface ApplePredicate {
    boolean test(Apple apple);
}

interface PrettyApple {
    String pretty(Apple apple);
}

class AppleBetweenDollars implements PrettyApple {
    public String pretty(Apple apple) {
        return "$" + apple.toString() + "$";
    }
}

class AppleBetweenExclamationPoints implements PrettyApple {
    public String pretty(Apple apple) {
        return "!" + apple.toString() + "!";
    }
}

class AppleReadAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.color.equals("Red") && apple.weight > 150;
    }
}


