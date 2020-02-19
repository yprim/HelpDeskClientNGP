package com.ucr.fuel.controller;


import com.ucr.fuel.converter.VehicleRestConverter;
import com.ucr.fuel.domain.business.Vehicle;
import com.ucr.fuel.dto.VehicleDTO;
import com.ucr.fuel.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/vehicles")
@CrossOrigin
public class VehicleController {

    @Autowired
    private VehicleService service;

    @Autowired
    private VehicleRestConverter converter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public VehicleDTO.Response findById(
            @PathVariable("id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public VehicleDTO.Response save(@RequestBody VehicleDTO.Request vehicle) {
        return converter.toResponse(service.save(converter.fromRequest(vehicle)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public VehicleDTO.Response update(@PathVariable("id") Integer id,
                                      @RequestBody VehicleDTO.Request vehicle) {
        Vehicle toUpdate = converter.fromRequest(vehicle);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<VehicleDTO.Response> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
