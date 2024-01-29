import java.util.function.BiFunction;

public class LambdasDemo {
	public static void main(String[] args) {
		Apple apple = new Apple("red", 152);
		BiFunction<String, Integer, Apple> appleGen = Apple::new;
		System.out.println(appleGen.apply("green", 120));
	}

}

class Apple {
	static long counter = 0;
	long id;
	Color color;
	int weight;

	public Apple(String color, int weight) {
		this.id = counter++;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase());
	}

	public String toString() {
		return "{id: " + id + ", color: " + color + ", weight: " + weight + "}";
	}
}

enum Color {
	RED("red"), GREEN("green");

	private String color;

	private Color(String color) {
		this.color = color;
	}


}
