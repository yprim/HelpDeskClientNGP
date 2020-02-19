package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    private RouteRepository repository;

    public Route save(Route route) {
        return repository.save(route);
    }

    public Route update(Route route) {
        find(route.getId());
        return repository.save(route);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Route> findAll() {
        return repository.findAll();
    }


    public Route find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Route.class, id));
    }
}









