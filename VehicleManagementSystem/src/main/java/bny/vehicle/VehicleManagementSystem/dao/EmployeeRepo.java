package bny.vehicle.VehicleManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bny.vehicle.VehicleManagementSystem.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
