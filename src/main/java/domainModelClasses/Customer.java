package domainModelClasses;

import java.util.Date;
import java.util.List;

public class Customer extends Account{
	
	private String licenceNumber;
	private Date licenceExpiry;
	
	public boolean addReservation() {
		return false;
		
	}
	
	public boolean cancelReservation() {
		return false;
		
	}
	
	public List<VehicleReservation> getReservation(){
		return null;
		
	}

	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}

}
