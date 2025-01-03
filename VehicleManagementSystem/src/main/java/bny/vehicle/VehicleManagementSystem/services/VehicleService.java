package bny.vehicle.VehicleManagementSystem.services;

import java.util.List;

import bny.vehicle.VehicleManagementSystem.entity.Vehicle;

public interface VehicleService {

 List<Vehicle> getAllVehicleData();

Vehicle saveVehicle(Vehicle vehicle);

Vehicle getVehicleById(int vehicleid);

void deleteVehicle(int id);

Vehicle updateVehicle(int id, Vehicle vehicledetail);


		
	

}
