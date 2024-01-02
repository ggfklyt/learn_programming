public class Holder3<T> {
	private T a;
	public Holder3(T a) { this.a = a; }

	T get() { return a; }
	void set(T a) { this.a = a; }

	public statiic void main(String[] args) {
		Holder<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		// h3.set("Not an automobile"); // Error
		// h3.set(1); // Error
	}
}
