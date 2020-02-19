package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.domain.business.Vehicle;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository repository;

    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public Vehicle update(Vehicle vehicle) {
        find(vehicle.getId());
        return repository.save(vehicle);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    public List<Vehicle> findAllByDriver() {
        return repository.findAll();
    }

    public Vehicle find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Route.class, id));
    }
}









