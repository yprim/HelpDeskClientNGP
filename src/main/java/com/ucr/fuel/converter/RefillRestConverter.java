package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Refill;
import com.ucr.fuel.dto.RefillDTO;
import com.ucr.fuel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefillRestConverter implements RestConverter<Refill,
        RefillDTO.Response,
        RefillDTO.Request> {


    @Autowired
    private RouteService routeService;
    @Autowired
    private RouteRestConverter routeConverter;

    @Override
    public RefillDTO.Response toResponse(Refill entity) {
        RefillDTO.Response response = new RefillDTO.Response();
        response.setId(entity.getId());
        response.setAmount(entity.getAmount());
        response.setDateTime(entity.getDateTime());
        response.setKm(entity.getKm());
        response.setLiters(entity.getLiters());
        response.setRoute(routeConverter.toResponse(entity.getRoute()));
        return response;
    }

    @Override
    public Refill fromRequest(RefillDTO.Request request) {
        Refill entity = new Refill();
        entity.setAmount(request.getAmount());
        entity.setDateTime(request.getDateTime());
        entity.setRoute(routeService.find(request.getRouteId()));
        entity.setKm(request.getKm());
        entity.setLiters(request.getLiters());
        return entity;
    }
}
