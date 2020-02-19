package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(name = "model")
    private String model;
    @Column(name = "plate")
    @NotNull
    private String plateNumber;
    @Column(name = "year")
    @NotNull
    private String year;
    @Column(name = "type_of_fuel")
    @NotNull
    private String typeOfFuel;
    @Column(name = "status")
    @NotNull
    private String status;
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private List<Route> routes;



    @ManyToMany(cascade = {
            CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "driver_vehicle",
            joinColumns = {@JoinColumn(name = "vehicle_id")},
            inverseJoinColumns = {@JoinColumn(name = "driver_id")})
    private List<Driver> drivers;




    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", year='" + year + '\'' +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                ", status='" + status + '\'' +
                ", drivers=" + drivers.stream().map(Object::toString).collect(Collectors.joining(",")) +
                '}';
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
}
