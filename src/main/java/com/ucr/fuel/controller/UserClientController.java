package com.ucr.fuel.controller;



import com.ucr.fuel.converter.UserClientRestConverter;
import com.ucr.fuel.domain.business.UserClient;
import com.ucr.fuel.dto.UserClientDTO;
import com.ucr.fuel.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/userClients")
@CrossOrigin
public class UserClientController {

    @Autowired
    private UserClientService userClientService;

    @Autowired
    private UserClientRestConverter userClientConverter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public UserClientDTO.Response findById(
            @PathVariable("id") Integer id) {
        return userClientConverter.toResponse(userClientService.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public UserClientDTO.Response save(@Valid  UserClientDTO.Request user) {
        return userClientConverter.toResponse(userClientService.save(userClientConverter.fromRequest(user)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public UserClientDTO.Response update(@Valid @PathVariable("id") Integer id,
                                    @RequestBody UserClientDTO.Request user) {
        UserClient toUpdate = userClientConverter.fromRequest(user);
        toUpdate.setId(id);
        return userClientConverter.toResponse(userClientService.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        userClientService.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<UserClientDTO.Response> findAll() {
        return userClientService.findAll().stream().map(it -> userClientConverter.toResponse(it))
                .collect(Collectors.toList());
    }


}
