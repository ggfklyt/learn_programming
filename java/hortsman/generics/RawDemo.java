class Gen<T> {
	private T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

	public T getOb() {
		return obj;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iob = new Gen<Integer>(88);

		Gen<String> strOb = new Gen<String>("Generics test");

		Gen raw = new Gen(Double.valueOf(98.6));

		double d = (Double) raw.getOb();
		System.out.println("value: " + d);

		int i = (Integer) raw.getOb();
		
		strOb = raw; // OK, but potentially wrong
		//String str = strOb.getOb(); // run-time error
		Gen<Integer> iob2 = new Gen("kj");
	}
}
