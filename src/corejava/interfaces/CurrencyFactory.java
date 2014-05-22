package corejava.interfaces;

public class CurrencyFactory {
	public static Currency createCurrencySymbol(String country){
		if(country.equalsIgnoreCase("India"))
			return new Rupee();
		else if (country.equalsIgnoreCase("USA")) {
			return new USDoller();
		}
		else {
			return null;
		}
	}
}

class Rupee implements Currency{

	@Override
	public int ratePerDoller() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*100);
	}

	@Override
	public String currencySymbol() {
		// TODO Auto-generated method stub
		return "Rs";
	}
	
}

class USDoller implements Currency{

	@Override
	public int ratePerDoller() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String currencySymbol() {
		// TODO Auto-generated method stub
		return "USD";
	}
}