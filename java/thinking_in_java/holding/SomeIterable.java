import java.util.Iterator;

public class SomeIterable implements Iterable<String> {
	private String[] array = { "1", "2", "3", "4" };

	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			public boolean hasNext() {
				return array.length > index;
			}

			public String next() {
				return array[index++]; 
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		SomeIterable iterable = new SomeIterable();
		for (String i: iterable)
			System.out.println(i);
	}
}
