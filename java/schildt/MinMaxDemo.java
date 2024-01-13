interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	T[] array;

	public MinMaxImpl(T[] array) {
		this.array = array;
	}

	public T min() {
		T min = array[0];
		for (int i = 0; i < array.length; i++)
			if (min.compareTo(array[i]) > 0)
				min = array[i];
		return min;
	}

	public T max() {
		T max = array[0];
		for (int i = 0; i < array.length; i++)
			if (max.compareTo(array[i]) < 0)
				max = array[i];
		return max;
	}
}

class User implements Comparable<User> {
	int age;
	String name;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(User user) {
		return this.age - user.age;
	}

	public String toString() {
		return "{name=" + name + "; age=" + age + "}";
	}
}

public class MinMaxDemo {
	public static void main(String[] args) {
		MinMaxImpl<Integer> minMax = new MinMaxImpl<Integer>(new Integer[]{ 1, 2 , 3, -2});
		System.out.println(minMax.min());
		System.out.println(minMax.max());

		MinMaxImpl<User> users = new MinMaxImpl<>(new User[]{ new User("Ivan", 15), new User("Kolyan", 25)});
		System.out.println(users.min());
		System.out.println(users.max());

	}
}
