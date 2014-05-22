package corejava.interfaces;

public class CurrencyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency currencyObj = CurrencyFactory.createCurrencySymbol("india");
		String symbol = currencyObj.currencySymbol();
		int rate = currencyObj.ratePerDoller();
		System.out.println(rate+" "+symbol);
	}

}
