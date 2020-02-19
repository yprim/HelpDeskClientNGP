package com.ucr.fuel.dto;

import java.util.List;

public class VehicleDTO {

    public static class Response {
        private Integer id;
        private String model;
        private String plateNumber;
        private String year;
        private String typeOfFuel;
        private String status;
        private List<Integer> drivers;
        private List<Integer> routes;
        private List<Integer> refills;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTypeOfFuel() {
            return typeOfFuel;
        }

        public void setTypeOfFuel(String typeOfFuel) {
            this.typeOfFuel = typeOfFuel;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Integer> getDrivers() {
            return drivers;
        }

        public void setDrivers(List<Integer> drivers) {
            this.drivers = drivers;
        }

        public List<Integer> getRoutes() {
            return routes;
        }

        public void setRoutes(List<Integer> routes) {
            this.routes = routes;
        }

        public List<Integer> getRefills() {
            return refills;
        }

        public void setRefills(List<Integer> refills) {
            this.refills = refills;
        }
    }

    public static class Request {
        private String model;
        private String plateNumber;
        private String year;
        private String typeOfFuel;
        private String status;
        private List<Integer> drivers;
        private List<Integer> routes;
        private List<Integer> refills;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTypeOfFuel() {
            return typeOfFuel;
        }

        public void setTypeOfFuel(String typeOfFuel) {
            this.typeOfFuel = typeOfFuel;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Integer> getDrivers() {
            return drivers;
        }

        public void setDrivers(List<Integer> drivers) {
            this.drivers = drivers;
        }

        public List<Integer> getRoutes() {
            return routes;
        }

        public void setRoutes(List<Integer> routes) {
            this.routes = routes;
        }

        public List<Integer> getRefills() {
            return refills;
        }

        public void setRefills(List<Integer> refills) {
            this.refills = refills;
        }
    }
}

