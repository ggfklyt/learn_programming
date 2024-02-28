import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Some2 {
	public static void main(String[] args) throws IOException {
		Card[] cards = new Card[] {
			new Card("q1", "a1"),
			new Card("q2", "a2"),
			new Card("q3", "a3"),
			new Card("q4", "a4")
		};
		FileWriter writer = new FileWriter("output.txt");
		for (Card card: cards) {
			writer.write(card.getQuestion() + "/" + card.getAnswer() + "\n");
		}
		writer.close();
		FileReader fileReader = new FileReader("output.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}
}
