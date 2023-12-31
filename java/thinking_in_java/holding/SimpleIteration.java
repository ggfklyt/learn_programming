import java.util.*;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pet.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet p: pets)
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}

class Pet {
	private long id = counter++;
	private static long counter;

	public static List<Pet> arrayList(int size) {
		List<Pet> list = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			list.add(new Pet());
		}
		return list;
	}

	public long id() { return id; }
}
