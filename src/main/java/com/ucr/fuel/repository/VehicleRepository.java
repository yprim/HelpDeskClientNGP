package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {


}
