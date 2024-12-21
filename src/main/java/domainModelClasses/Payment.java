package domainModelClasses;

import java.util.Date;

import enumclasses.PaymentStatus;

public abstract class Payment {
	
	private double amount;
	private Date timestamp;
	private PaymentStatus status;
	
	public abstract boolean makePayment();
}
