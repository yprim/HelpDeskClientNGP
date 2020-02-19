package com.ucr.fuel.service;

import com.ucr.fuel.domain.business.UserClient;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClientService {
    @Autowired
    private UserClientRepository repository;

    public UserClient save(UserClient userClient) {
        return repository.save(userClient);
    }

    public UserClient update(UserClient driver) {
        find(driver.getId());
        return repository.save(driver);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<UserClient> findAll() {
        return repository.findAll();
    }


    public UserClient find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(UserClient.class, id));
    }
}
