package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.IssueClient;
import com.ucr.fuel.dto.IssueClientDTO;
import com.ucr.fuel.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueClientRestConverter implements RestConverter<IssueClient, IssueClientDTO.Response, IssueClientDTO.Request > {
    @Autowired
    private UserClientRestConverter userClientConverter;

    @Autowired
    private UserClientService userClientService;

    @Override
    public IssueClientDTO.Response toResponse(IssueClient entity) {
        IssueClientDTO.Response response = new IssueClientDTO.Response();
        response.setId(entity.getId() );
        response.setDescription(entity.getDescription());
        response.setReportNumber(entity.getReportNumber() );
        response.setRegisterTimestamp(entity.getRegisterTimestamp() );
        response.setAddress(entity.getAddress() );
        response.setPhone(entity.getPhone() );
        response.setEmail(entity.getEmail() );
        response.setStatus(entity.getStatus() );
        response.setSupportUserAsigned(entity.getSupportUserAsigned() );
        response.setUserClient(userClientConverter.toResponse( entity.getUserClient()) );
        return response;
    }

    @Override
    public IssueClient fromRequest(IssueClientDTO.Request request) {
        IssueClient entity = new IssueClient();
        entity.setDescription(request.getDescription());
        entity.setReportNumber(request.getReportNumber());
        entity.setRegisterTimestamp(request.getRegisterTimestamp());
        entity.setAddress(request.getAddress());
        entity.setPhone(request.getPhone());
        entity.setEmail(request.getEmail());
        entity.setStatus(request.getStatus());
        entity.setSupportUserAsigned(request.getSupportUserAsigned());
        entity.setUserClient(userClientService.find(request.getUserClientID()));

        return entity;
    }
}
