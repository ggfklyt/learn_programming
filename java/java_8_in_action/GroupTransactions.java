import java.util.*;

public class GroupTransactions {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
				new Transaction(Currency.EURO),
				new Transaction(Currency.DOLLAR),
				new Transaction(Currency.RUB),
				new Transaction(Currency.EURO)
				);
		Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
		for (Transaction transaction: transactions) {
			Currency currency = transaction.getCurrency();
			List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
			if (transactionsForCurrency == null) {
				transactionsForCurrency = new ArrayList<>();
				transactionsByCurrencies.put(currency, transactionsForCurrency);
			}
			transactionsForCurrency.add(transaction);
		}
		System.out.println(transactionsByCurrencies);
	}
}
