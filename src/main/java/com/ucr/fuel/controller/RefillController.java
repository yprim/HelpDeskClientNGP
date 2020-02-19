package com.ucr.fuel.controller;


import com.ucr.fuel.converter.RefillRestConverter;
import com.ucr.fuel.domain.business.Refill;
import com.ucr.fuel.dto.RefillDTO;
import com.ucr.fuel.service.RefillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/refills")
@CrossOrigin
public class RefillController {

    @Autowired
    private RefillService service;

    @Autowired
    private RefillRestConverter converter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public RefillDTO.Response findById(@PathVariable("id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public RefillDTO.Response save(@RequestBody RefillDTO.Request refill) {
        return converter.toResponse(service.save(converter.fromRequest(refill)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public RefillDTO.Response update(@PathVariable(value = "id", required = false) Integer id,
                                     @RequestBody RefillDTO.Request refill) {
        Refill toUpdate = converter.fromRequest(refill);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<RefillDTO.Response> findAll(@RequestParam(value = "routeId", required = false) Integer routeId,
                                            @RequestParam(value = "driverId", required = false) Integer driverId) {
        List<Refill> refills;
        if (routeId != null) {
            refills = service.findAllByRoute(routeId);
        } else if (driverId != null) {
            refills = service.findAllByDriver(driverId);
        } else refills = service.findAll();

        return refills.stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
