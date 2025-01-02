package bny.vehicle.VehicleManagementSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bny.vehicle.VehicleManagementSystem.dao.EmployeeRepo;
import bny.vehicle.VehicleManagementSystem.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	
	EmployeeRepo employeerepo;
	
	public List<Employee>  getAllEmployeeData(){
		  List<Employee> listOfEmployee = this.employeerepo.findAll();
		return listOfEmployee;
	}
	
	@Override
	public Employee saveEmployee(Employee employee){
	return employeerepo.save(employee);
}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
	Employee employeeFromRepo= this.employeerepo.findById(employeeId).orElse(null);
			return employeeFromRepo;
	}
	
	@Override
	public Employee deleteEmployee(int id) {
		Employee emp=this.employeerepo.findById(id).orElse(null);
		return employeerepo.save(emp);

	}
	@Override
	public Employee updateEmployee(int id, Employee employeeWithNewValue) {
		
		Employee employeeFromDb = employeerepo.findById(id).orElse(null);
		employeeFromDb.setEmployeeName(employeeWithNewValue.getEmployeeName());
		employeeFromDb.setDepartment(employeeWithNewValue.getDepartment());
		employeeFromDb.setAddress(employeeWithNewValue.getAddress());
		employeeFromDb.setPhoneNumber(employeeWithNewValue.getPhoneNumber());
		employeerepo.save(employeeFromDb);
		return employeeFromDb ;
		
	}
	
}
