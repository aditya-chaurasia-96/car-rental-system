package domainModelClasses;

import java.util.HashMap;
import java.util.List;

public class VehicleCatalog implements Search {
	
	private HashMap<String, List<Vehicle>> vehicleTypes;
	private HashMap<String, List<Vehicle>> vehicleModels;

	@Override
	public List<Vehicle> searchByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> searchByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

}
