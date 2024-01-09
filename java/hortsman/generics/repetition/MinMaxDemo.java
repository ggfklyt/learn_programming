interface MinMax <T extends Comparable<T>> {
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
		for (int i = 1; i < array.length; i++) {
			if (min.compareTo(array[i]) > 0)
				min = array[i];
		}
		return min;
	}

	public T max() {
		T max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0)
				max = array[i];
		}
		return max;
	}
}

public class MinMaxDemo {
	public static void main(String[] args) {
	
	}
} 
