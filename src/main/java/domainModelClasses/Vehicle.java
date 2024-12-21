package domainModelClasses;

import java.util.List;

import enumclasses.VehicleStatus;

public abstract class Vehicle {
	private String vehicleId;
	private String licenceNumber;
	private int passengerCapacity;
	private boolean hasSunroof;
	private VehicleStatus status;
	private String model;
	private int manufacturingYear;
	private int mileagel;
	private List<VehicleLog> log;
	
	public abstract boolean reserveVehicle();
	public abstract boolean returnVehicle();
}
