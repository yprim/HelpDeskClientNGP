package com.ucr.fuel.dto;

import java.util.Date;

public class RouteDTO {

    public static class Request {
        private String origin;
        private String destination;
        private Date startTime;
        private Integer duration;
        private String status;
        private Integer driverId;
        private Integer vehicleId;

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getDriverId() {
            return driverId;
        }

        public void setDriverId(Integer driverId) {
            this.driverId = driverId;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }
    }

    public static class Response {
        private Integer id;
        private String origin;
        private String destination;
        private Date startTime;
        private Integer duration;
        private String status;
        private DriverDTO.Response driver;
        private VehicleDTO.Response vehicle;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public DriverDTO.Response getDriver() {
            return driver;
        }

        public void setDriver(DriverDTO.Response driver) {
            this.driver = driver;
        }

        public VehicleDTO.Response getVehicle() {
            return vehicle;
        }

        public void setVehicle(VehicleDTO.Response vehicle) {
            this.vehicle = vehicle;
        }
    }


}
