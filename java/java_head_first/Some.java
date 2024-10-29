import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Some {
	public static void main(String[] args) {
		Card c1 = new Card("q1", "a1");
		Card c2 = new Card("q2", "a2");
		Card c3 = new Card("q3", "a3");
		Card[] cards = new Card[] { c1, c2, c3 };

		try {
			FileOutputStream fos = new FileOutputStream("cards.info");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Card card: cards) {
				oos.writeObject(card);
			}
			FileInputStream fis = new FileInputStream("cards.info");
			ObjectInputStream ois = new ObjectInputStream(fis);
			for (int i = 0; i < cards.length; i++) {
				Card card = (Card) ois.readObject();
				System.out.println(card);
			}
		} catch (IOException e) {
			System.out.println("Some error occured: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
