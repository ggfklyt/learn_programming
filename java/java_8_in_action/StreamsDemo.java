import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Dish> menu = Dish.generateMenu();
		List<String> lowCaloricDishes = menu.parallelStream()
			.filter(d -> d.getCalories() > 120)
			.sorted(Comparator.comparing(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());
		lowCaloricDishes.forEach(System.out::println);
	}
}

class Dish {
	private int calories;
	private String name;

	public Dish(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	public static List<Dish> generateMenu() {
		return Arrays.asList(new Dish[] { new Dish("Soup", 150), new Dish("rice", 53), new Dish("fish", 123) });
	}

	public int getCalories() { return calories; }
	public String getName() { return name; }
	public String toString() {
		return "{name: " + name + ", calories: " + calories + "}";
	}

}
