package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.domain.business.Vehicle;
import com.ucr.fuel.dto.VehicleDTO;
import com.ucr.fuel.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class VehicleRestConverter implements RestConverter<Vehicle, VehicleDTO.Response, VehicleDTO.Request> {

    @Autowired
    private DriverService driverService;

    @Override
    public VehicleDTO.Response toResponse(Vehicle vehicle) {
        VehicleDTO.Response dto = new VehicleDTO.Response();
        dto.setId(vehicle.getId());
        dto.setModel(vehicle.getModel());
        dto.setYear(vehicle.getYear());
        dto.setPlateNumber(vehicle.getPlateNumber());
        dto.setStatus(vehicle.getStatus());
        dto.setTypeOfFuel(vehicle.getTypeOfFuel());
        if (vehicle.getDrivers() != null)
            dto.setDrivers(vehicle.getDrivers().stream()
                    .filter(driver -> driver.getId() != null)
                    .map(Driver::getId)
                    .collect(Collectors.toList()));
        return dto;
    }

    @Override
    public Vehicle fromRequest(VehicleDTO.Request dto) {
        Vehicle entity = new Vehicle();
        entity.setModel(dto.getModel());
        entity.setYear(dto.getYear());
        entity.setPlateNumber(dto.getPlateNumber());
        entity.setStatus(dto.getStatus());
        entity.setTypeOfFuel(dto.getTypeOfFuel());
        if (dto.getDrivers() != null) {
            entity.setDrivers(new ArrayList<>());
            entity.getDrivers().addAll(dto.getDrivers().stream()
                    .map(it -> driverService.find(it))
                    .collect(Collectors.toList()));
        }
        return entity;
    }
}
