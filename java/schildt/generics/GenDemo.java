public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iObj = new Gen<>(10);
		System.out.println("Type is " + iObj.get().getClass());
		Gen<String> strObj = new Gen<>("some string");
		System.out.println("Type is " + strObj.get().getClass());
		//iObj = strObj;
	}
}
