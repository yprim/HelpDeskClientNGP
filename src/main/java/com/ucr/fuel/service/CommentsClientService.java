package com.ucr.fuel.service;



import com.ucr.fuel.domain.business.CommentsClient;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.CommentsClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsClientService {
    @Autowired
    private CommentsClientRepository repository;

    public CommentsClient save(CommentsClient commentsClient) {
        return repository.save(commentsClient);
    }

    public CommentsClient update(CommentsClient commentsClient) {
        findById(commentsClient.getId());
        return repository.save(commentsClient);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<CommentsClient> findAll() {
        return repository.findAll();
    }


    public CommentsClient findById(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(CommentsClient.class, id));
    }

    //Sobrecarga
    //public List<Vehicle> findAll(){ return repository.findAll(Sort.by(Sort.Direction.ASC, "years")); }

}//class
