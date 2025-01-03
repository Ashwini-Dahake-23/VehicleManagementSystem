package bny.vehicle.VehicleManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	private int id;
	private int vehicleid;
	private String vehicleName;
	private String vehicleNumber;
	private String vehiclecolour;
	private String VOwnerName;
	private String vehicleAddress;
	
	public Vehicle() {
		super();
		
	}

	public Vehicle(int id, int vehicleid, String vehicleName, String vehicleNumber, String vehiclecolour,
			String vOwnerName, String vehicleAddress) {
		super();
		this.id = id;
		this.vehicleid = vehicleid;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.vehiclecolour = vehiclecolour;
		VOwnerName = vOwnerName;
		this.vehicleAddress = vehicleAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehiclecolour() {
		return vehiclecolour;
	}

	public void setVehiclecolour(String vehiclecolour) {
		this.vehiclecolour = vehiclecolour;
	}

	public String getVOwnerName() {
		return VOwnerName;
	}

	public void setVOwnerName(String vOwnerName) {
		VOwnerName = vOwnerName;
	}

	public String getVehicleAddress() {
		return vehicleAddress;
	}

	public void setVehicleAddress(String vehicleAddress) {
		this.vehicleAddress = vehicleAddress;
	}
	
	
	
	
	

}
