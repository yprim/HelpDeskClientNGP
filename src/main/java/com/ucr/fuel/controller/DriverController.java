package com.ucr.fuel.controller;


import com.ucr.fuel.converter.DriverRestConverter;
import com.ucr.fuel.converter.VehicleRestConverter;
import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.dto.DriverDTO;
import com.ucr.fuel.dto.VehicleDTO;
import com.ucr.fuel.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/drivers")
@CrossOrigin
public class DriverController {

    @Autowired
    private DriverService service;

    @Autowired
    private DriverRestConverter converter;
    @Autowired
    private VehicleRestConverter vehicleRestConverter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public DriverDTO.Response findById(
            @PathVariable("id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public DriverDTO.Response save(@RequestBody DriverDTO.Request driver) {

        return converter.toResponse(service.save(converter.fromRequest(driver)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public DriverDTO.Response update(@PathVariable("id") Integer id,
                                     @RequestBody DriverDTO.Request driver) {
        Driver toUpdate = converter.fromRequest(driver);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<DriverDTO.Response> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }

    @RequestMapping(path = "/{id}/vehicles", method = RequestMethod.GET)
    public List<VehicleDTO.Response> findVehiclesByDriverAll(@PathVariable("id") Integer id) {
        return service.find(id).getVehicles()
                .stream()
                .map(it -> vehicleRestConverter.toResponse(it))
                .collect(Collectors.toList());
    }


}
