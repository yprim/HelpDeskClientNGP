package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Refill;
import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.RefillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefillService {
    @Autowired
    private RefillRepository repository;

    public Refill save(Refill refill) {
        return repository.save(refill);
    }

    public Refill update(Refill refill) {
        find(refill.getId());
        return repository.save(refill);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Refill> findAll() {
        return repository.findAll();
    }

    public List<Refill> findAllByRoute(Integer routeId) {
        return repository.findAllByRoute(new Route(routeId));
    }

    public List<Refill> findAllByDriver(Integer routeId) {
        return repository.findAllByDriver(routeId);
    }


    public Refill find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Refill.class, id));
    }
}









