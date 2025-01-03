package bny.vehicle.VehicleManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import bny.vehicle.VehicleManagementSystem.entity.Vehicle;
import bny.vehicle.VehicleManagementSystem.services.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleservice;

	@GetMapping("/AllVehicle")
	public ResponseEntity<List<Vehicle>> getAllVehicle() {
		List<Vehicle> AllVehicle = this.vehicleservice.getAllVehicleData();
		return new ResponseEntity(AllVehicle, HttpStatus.OK);
	}
	
    @PostMapping("/addVehicle")
    public ResponseEntity<Vehicle>createVehicle(@RequestBody Vehicle vehicle){
    	Vehicle add = vehicleservice.saveVehicle(vehicle);
		return ResponseEntity.ok(add);	
    }
    @GetMapping("getid/{id}")
    public ResponseEntity<Vehicle>getVehicleById(@PathVariable ("id") int vehicleid){
    	Vehicle vehicleobject = this.vehicleservice.getVehicleById(vehicleid);
    	return new ResponseEntity(vehicleobject,HttpStatus.OK);
    }
    @DeleteMapping("/deleteid/{id}")
    public ResponseEntity<String>DeleteById(@PathVariable("id") int id ){
    	this.vehicleservice.deleteVehicle(id);
    	 return ResponseEntity.ok("Vehical details deleted with id" +id);
    }
    
    @PutMapping("/update{id}")
    public ResponseEntity<Vehicle>updateVehicle(@PathVariable("id") int id,
    		@RequestBody Vehicle vehicledetail){
    	Vehicle vDetails = this.vehicleservice.updateVehicle(id,vehicledetail);
    	return ResponseEntity.ok(vDetails);
    	
    }
}
