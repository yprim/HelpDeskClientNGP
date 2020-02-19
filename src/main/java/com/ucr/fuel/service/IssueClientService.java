package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.IssueClient;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.IssueClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueClientService {
    @Autowired
    private IssueClientRepository repository;

    public IssueClient save(IssueClient issueClient) {
        return repository.save(issueClient);
    }

    public IssueClient update(IssueClient issueClient) {
        find(issueClient.getId());
        return repository.save(issueClient);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<IssueClient> findAll() {
        return repository.findAll();
    }


    public IssueClient find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(IssueClient.class, id));
    }
}
