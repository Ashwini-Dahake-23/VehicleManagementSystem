package bny.vehicle.VehicleManagementSystem.services;

import java.util.List;

import bny.vehicle.VehicleManagementSystem.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployeeData();

	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(int employeeId);
	
	
	Employee deleteEmployee(int id);
	
	Employee updateEmployee(int id, Employee employeedetail);

	

}
