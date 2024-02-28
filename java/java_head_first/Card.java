import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = 2372970599910523877L;
	private String question;
	private String answer;

	public Card(String q, String a) { question = q; answer = a; }

	public String getQuestion() { return question; }

	public String getAnswer() { return answer; }	

	public String toString() {
		return "Card{" + "question: " + question + ", answer: " + answer + "}";
	}
}
