package domainModelClasses;

import java.util.List;

public class CarRentalSystem {
	private String name;
	private List<CarRentalBranch> branches;
	
	public void addNewBranch(CarRentalBranch branch) {
		
	}
	
	private static CarRentalSystem system = null;
	
	public static CarRentalSystem getInstance() {
		if(system == null)
			system = new CarRentalSystem();
		return system;
	}
}
