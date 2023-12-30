import java.util.*;

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println(this.gerbilNumber + " hopping");
	}
}

class GerbilHoping {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 3; i++)
			gerbils.add(new Gerbil(i));
		for (Gerbil gerbil: gerbils)
			gerbil.hop();
	}
}
