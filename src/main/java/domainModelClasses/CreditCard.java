package domainModelClasses;

public class CreditCard extends Payment{

	private String nameOnCard;
	private String cardNumber;
	private String billingAddress;
	private int code;
	
	@Override
	public boolean makePayment() {
		// TODO Auto-generated method stub
		return false;
	}

}
