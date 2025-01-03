package bny.vehicle.VehicleManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bny.vehicle.VehicleManagementSystem.entity.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
