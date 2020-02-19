package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.UserClient;
import com.ucr.fuel.dto.UserClientDTO;
import org.springframework.stereotype.Service;

@Service
public class UserClientRestConverter implements RestConverter<UserClient, UserClientDTO.Response, UserClientDTO.Request>{


    @Override
    public UserClientDTO.Response toResponse(UserClient entity) {
        UserClientDTO.Response response = new UserClientDTO.Response();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setFirstSurname(entity.getFirstSurname());
        response.setSecondSurname(entity.getSecondSurname());
        response.setAddress(entity.getAddress());
        response.setPhone(entity.getPhone());
        response.setSecondContact(entity.getSecondContact());
        response.setEmail(entity.getEmail());
        response.setPassword(entity.getPassword());
        response.setTelevision(entity.getTelevision());
        response.setMobilePhone(entity.getMobilePhone());
        response.setTelephone(entity.getTelephone());
        response.setInternet(entity.getInternet());
        return response;
    }

    @Override
    public UserClient fromRequest(UserClientDTO.Request request) {
        UserClient entity = new UserClient();
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setAddress(request.getAddress());
        entity.setPhone(request.getPhone());
        entity.setSecondContact(request.getSecondContact());
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        entity.setTelevision(request.getTelevision());
        entity.setMobilePhone(request.getMobilePhone());
        entity.setTelephone(request.getTelephone());
        entity.setInternet(request.getInternet());
        return entity;
    }
}
