package com.ucr.fuel.controller;


import com.ucr.fuel.converter.IssueClientRestConverter;
import com.ucr.fuel.domain.business.IssueClient;
import com.ucr.fuel.dto.IssueClientDTO;
import com.ucr.fuel.service.IssueClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/issueClients")
@CrossOrigin
public class IssueClientController {

    @Autowired
    private IssueClientService issueClientService;

    @Autowired
    private IssueClientRestConverter issueClientConverter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public IssueClientDTO.Response findById(
            @PathVariable("id") Integer id) {
        return issueClientConverter.toResponse(issueClientService.find(id));
    }
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public IssueClientDTO.Response save(@Valid @RequestBody IssueClientDTO.Request Issue) {
        return issueClientConverter.toResponse(issueClientService.save(issueClientConverter.fromRequest(Issue)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public IssueClientDTO.Response update(@Valid @PathVariable("id") Integer id,
                                    @RequestBody IssueClientDTO.Request Issue) {
        IssueClient toUpdate = issueClientConverter.fromRequest(Issue);
        toUpdate.setId(id);
        return issueClientConverter.toResponse(issueClientService.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        issueClientService.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<IssueClientDTO.Response> findAll() {
        return issueClientService.findAll().stream().map(it -> issueClientConverter.toResponse(it))
                .collect(Collectors.toList());
    }

}
