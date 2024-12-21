package domainModelClasses;

import java.util.Date;
import java.util.List;

public class Receptionist extends Account{
	
	private Date dateJoined;
	
	public List<Customer> searchCustomer(String name){
		return null;
		
	}
	public boolean addReservation() {
		return false;
		
	}
	public boolean cancelReservation() {
		return false;
		
	}

	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}

}
