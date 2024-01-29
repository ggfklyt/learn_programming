public class Transaction {
	private static long counter = 0;
	private long id;
	private final Currency currency;

	public Transaction(Currency currency) { 
		this.currency = currency;
		id = counter++;
	}
	
	public Currency getCurrency()  { return currency; }
	public String toString() {
		return "{id:" + id + ", currency:" + currency + "}";
	}

}

enum Currency {
	DOLLAR, EURO, RUB;
}
