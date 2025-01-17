package domainModelClasses;

import enumclasses.AccountStatus;

public abstract class Account extends Person{
	private String accountId;
	private String password;
	private AccountStatus status;
	
	public abstract boolean resetPassword();
}
