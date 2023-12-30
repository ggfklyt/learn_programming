import java.util.*;

class Apple {
	private static long counter = 0;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		//Compile-time error
//		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
	}
}
