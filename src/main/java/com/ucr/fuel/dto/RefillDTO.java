package com.ucr.fuel.dto;

import java.math.BigDecimal;
import java.util.Date;

public class RefillDTO {


    public static class Request extends RefillDTO {
        Integer liters;
        Date dateTime;
        Integer km;
        BigDecimal amount;
        Integer routeId;

        public Integer getLiters() {
            return liters;
        }

        public void setLiters(Integer liters) {
            this.liters = liters;
        }

        public Date getDateTime() {
            return dateTime;
        }

        public void setDateTime(Date dateTime) {
            this.dateTime = dateTime;
        }

        public Integer getKm() {
            return km;
        }

        public void setKm(Integer km) {
            this.km = km;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public Integer getRouteId() {
            return routeId;
        }

        public void setRouteId(Integer routeId) {
            this.routeId = routeId;
        }
    }

    public static class Response extends RefillDTO {
        Integer id;
        Integer liters;
        Date dateTime;
        Integer km;
        BigDecimal amount;
        RouteDTO.Response route;

        public Integer getLiters() {
            return liters;
        }

        public void setLiters(Integer liters) {
            this.liters = liters;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer liters) {
            this.id = liters;
        }

        public Date getDateTime() {
            return dateTime;
        }

        public void setDateTime(Date dateTime) {
            this.dateTime = dateTime;
        }

        public Integer getKm() {
            return km;
        }

        public void setKm(Integer km) {
            this.km = km;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public RouteDTO.Response getRoute() {
            return route;
        }

        public void setRoute(RouteDTO.Response route) {
            this.route = route;
        }
    }

}
