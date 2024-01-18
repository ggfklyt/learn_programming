interface Condition<T> {
	boolean func(T v1, T v2);
}

class HighTemp {
	int val;

	public HighTemp(int val) {
		this.val = val;
	}

	public boolean isSame(HighTemp ht) {
		return val == ht.val;
	}

	public boolean isLessThan(HighTemp ht) {
		return val < ht.val;
	}

	public boolean equals(HighTemp ht) {
		return val == ht.val;
	}
}

public class LambdasDemo {

	static <T> int counter(T[] vals, Condition<T> f, T val) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], val)) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		HighTemp[] vals = new HighTemp[] { new HighTemp(10), new HighTemp(15), new HighTemp(20) };
		int sameCounter = counter(vals, HighTemp::isSame, new HighTemp(15));
		int lessCounter = counter(vals, HighTemp::isLessThan, new HighTemp(16));

		System.out.println(sameCounter);
		System.out.println(lessCounter);
	}
}
