interface MyFunc<T> {
	boolean func(T v1, T v2);
}

class HighTemp {
	int val;

	public HighTemp(int temp) {
		this.val = temp;
	}

	boolean isSame(HighTemp temp) {
		return this.val == temp.val;
	}

	boolean isLessThan(HighTemp temp) {
		return this.val < temp.val;
	}

	public boolean equals(HighTemp temp) {
		return this.val == temp.val;
	}
}

public class LambdasDemo {
	static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v)) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		HighTemp[] values = new HighTemp[] { new HighTemp(15), new HighTemp(25) };
		int sameCounter = LambdasDemo.counter(values, HighTemp::isSame, new HighTemp(15));
		int lessCounter = LambdasDemo.counter(values, HighTemp::isLessThan, new HighTemp(30));
		System.out.println(sameCounter);
		System.out.println(lessCounter);
	}
}
