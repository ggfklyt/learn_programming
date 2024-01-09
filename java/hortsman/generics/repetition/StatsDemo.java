class TwoD {
	int x;
	int y;

	public TwoD(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ThreeD extends TwoD {
	int z;

	public ThreeD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

class FourD extends ThreeD {
	int w;

	public FourD(int x, int y, int z, int w) {
		super(x, y, z);
		this.w = w;
	}
}

class Coords<T extends TwoD> {
	T[] c;

	public Coords(T[] c) {
		this.c = c;
	}
}

class Stats {

	static void showXY(Coords<? extends TwoD> coords) {
		for (int i = 0; i < coords.c.length; i++)
			System.out.println("(x: " + coords.c[i].x + "; y: " + coords.c[i].y + ")");
	}

	static void showXYZ(Coords<? extends ThreeD> coords) {
		for (int i = 0; i < coords.c.length; i++)
			System.out.println("(x: " + coords.c[i].x + "; y: " + coords.c[i].y + "; z: " + coords.c[i].z + ")"); 
	}

	
	static void showXYZW(Coords<? extends FourD> coords) {
		for (int i = 0; i < coords.c.length; i++)
			System.out.println("(x: " + coords.c[i].x + "; y: " + coords.c[i].y + "; z: " + coords.c[i].z + "; w: " + coords.c[i].w + ")");
	}
}

public class StatsDemo {
	public static void main(String[] args) {
		TwoD twoD = new TwoD(1, 2);
		ThreeD threeD = new ThreeD(1, 2, 3);
		Coords<ThreeD> threes = new Coords<>(new ThreeD[]{ new ThreeD(1, 2, 3), new ThreeD(4, 5, 6) });
		FourD fourD = new FourD(1, 2, 3, 4);
		
		Stats.showXY(threes);
		System.out.println();
		Stats.showXYZ(threes);
		System.out.println();
		//Stats.showXYZW(threes);
	}
}
