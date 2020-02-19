package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.dto.DriverDTO;
import org.springframework.stereotype.Service;

@Service
public class DriverRestConverter implements RestConverter<Driver, DriverDTO.Response, DriverDTO.Request> {
    @Override
    public DriverDTO.Response toResponse(Driver entity) {
        DriverDTO.Response dto = new DriverDTO.Response();
        dto.setId(entity.getId());
        dto.setCardNumber(entity.getCardNumber());
        dto.setName(entity.getName());
        dto.setLastName(entity.getLastName());
        dto.setPhone(entity.getPhone());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    @Override
    public Driver fromRequest(DriverDTO.Request dto) {
        Driver entity = new Driver();
        entity.setCardNumber(dto.getCardNumber());
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
