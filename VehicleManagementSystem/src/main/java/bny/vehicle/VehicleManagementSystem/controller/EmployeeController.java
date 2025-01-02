package bny.vehicle.VehicleManagementSystem.controller;

import java.util.List;

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

import bny.vehicle.VehicleManagementSystem.entity.Employee;
import bny.vehicle.VehicleManagementSystem.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/allEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee>allEmployee = this.employeeservice.getAllEmployeeData();
		return new ResponseEntity<>(allEmployee,HttpStatus.OK);
		
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee  = employeeservice.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable ("id")int employeeId){
		Employee employeeobj= this.employeeservice.getEmployeeById(employeeId);
		return new ResponseEntity<>(employeeobj,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee>deleteById(@PathVariable("id")int id){
		Employee emp=this.employeeservice.deleteEmployee(id);
		return ResponseEntity.ok(emp);
	
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id") int id,
				@RequestBody Employee employeedetail){
	Employee empdetails = this.employeeservice.updateEmployee(id, employeedetail);
     return ResponseEntity.ok(empdetails);
		
	}
	
}
