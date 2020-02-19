package com.ucr.fuel.controller;


import com.ucr.fuel.converter.RouteRestConverter;
import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.dto.RouteDTO;
import com.ucr.fuel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/routes")
@CrossOrigin
public class RouteController {

    @Autowired
    private RouteService service;

    @Autowired
    private RouteRestConverter converter;


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public RouteDTO.Response findById(
            @PathVariable("id") Integer id) {
        return converter.toResponse(service.find(id));
    }
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public RouteDTO.Response save(@RequestBody RouteDTO.Request route) {
        return converter.toResponse(service.save(converter.fromRequest(route)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public RouteDTO.Response update(@PathVariable("id") Integer id,
                                    @RequestBody RouteDTO.Request route) {
        Route toUpdate = converter.fromRequest(route);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<RouteDTO.Response> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
