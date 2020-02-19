package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "origin")
    @NotNull
    private String origin;
    @Column(name = "destination")
    @NotNull
    private String destination;
    @Column(name = "start_time")
    @NotNull
    private Date startTime;
    @Column(name = "duration")
    private Integer duration;
    @Column(name = "status")
    @NotNull
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;


    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;


    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    private List<Refill> refills;

    public Route() {
    }

    public Route(Integer routeId) {
        this.id = routeId;
    }

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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public List<Refill> getRefills() {
        return refills;
    }

    public void setRefills(List<Refill> refills) {
        this.refills = refills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return duration == route.duration &&
                Objects.equals(id, route.id) &&
                Objects.equals(origin, route.origin) &&
                Objects.equals(destination, route.destination) &&
                Objects.equals(startTime, route.startTime) &&
                Objects.equals(status, route.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, origin, destination, startTime, duration, status);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", start_time=" + startTime +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
