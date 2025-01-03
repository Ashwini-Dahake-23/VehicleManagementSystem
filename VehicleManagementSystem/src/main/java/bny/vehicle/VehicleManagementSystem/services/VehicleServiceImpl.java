package bny.vehicle.VehicleManagementSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bny.vehicle.VehicleManagementSystem.dao.VehicleRepo;
import bny.vehicle.VehicleManagementSystem.entity.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleRepo vehiclerepo;
	
	public List<Vehicle> getAllVehicleData(){
		List <Vehicle> listofvehicle= this.vehiclerepo.findAll();
		return listofvehicle;
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehiclerepo.save(vehicle);
	}

	@Override
	public Vehicle getVehicleById(int vehicleid) {
		Vehicle vehicleFromRepo = this.vehiclerepo.findById(vehicleid).orElse(null);
		return vehicleFromRepo;
	}

	@Override
	public void deleteVehicle(int id) {
		vehiclerepo.deleteById(id);;
	}

	@Override
	public Vehicle updateVehicle(int id, Vehicle vehicledetail) {
	Vehicle vehicleinfo = this.vehiclerepo.findById(id).orElse(null);
	vehicleinfo.setVOwnerName(vehicledetail.getVOwnerName());
	vehicleinfo.setVehicleAddress(vehicledetail.getVehicleAddress());
	vehicleinfo.setVehiclecolour(vehicledetail.getVehiclecolour());
	vehicleinfo.setVehicleName(vehicledetail.getVOwnerName());
	vehicleinfo.setVehicleNumber(vehicledetail.getVehicleNumber());
	vehiclerepo.save(vehicleinfo);
		return vehicleinfo ;
	}

}
