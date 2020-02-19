package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.dto.RouteDTO;
import com.ucr.fuel.service.DriverService;
import com.ucr.fuel.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteRestConverter implements RestConverter<Route,
        RouteDTO.Response,
        RouteDTO.Request> {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private DriverService driverService;
    @Autowired
    private VehicleRestConverter vehicleConverter;
    @Autowired
    private DriverRestConverter driverConverter;

    @Override
    public RouteDTO.Response toResponse(Route entity) {
        RouteDTO.Response response = new RouteDTO.Response();
        response.setId(entity.getId());
        response.setDestination(entity.getDestination());
        response.setDuration(entity.getDuration());
        response.setOrigin(entity.getOrigin());
        response.setStartTime(entity.getStartTime());
        response.setStatus(entity.getStatus());
        response.setDriver(driverConverter.toResponse(entity.getDriver()));
        response.setVehicle(vehicleConverter.toResponse(entity.getVehicle()));
        return response;
    }

    @Override
    public Route fromRequest(RouteDTO.Request request) {
        Route entity = new Route();
        entity.setDestination(request.getDestination());
        entity.setDuration(request.getDuration());
        entity.setOrigin(request.getOrigin());
        entity.setStartTime(request.getStartTime());
        entity.setStatus(request.getStatus());
        entity.setDriver(driverService.find(request.getDriverId()));
        entity.setVehicle(vehicleService.find(request.getVehicleId()));

        return entity;
    }
}
