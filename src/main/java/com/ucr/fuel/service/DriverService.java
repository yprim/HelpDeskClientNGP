package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepository repository;

    public Driver save(Driver driver) {
        return repository.save(driver);
    }

    public Driver update(Driver driver) {
        find(driver.getId());
        return repository.save(driver);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Driver> findAll() {
        return repository.findAll();
    }


    public Driver find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Driver.class, id));
    }
}









