public class Gen<T> {
	private T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}
