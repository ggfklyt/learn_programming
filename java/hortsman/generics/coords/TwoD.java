public class TwoD {
	int x;
	int y;

	public TwoD(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String showXY() {
		return "(x: " + x + "; y: " + y + ")";
	};
}

class ThreeD extends TwoD {
	int z;

	public ThreeD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public String showXYZ() {
		return "(x: " + x + "; y: " + y + ")";
	}
}

class Coords<T extends TwoD> {
	T[] coords;

	Coords(T[] o) { coords = o; }
}

class BoundedWildCard {
	static void showXY(Coords<?> c) {
		System.out.println("X Y Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}

	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y Z Coordinates");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		System.out.println();
	}
}
