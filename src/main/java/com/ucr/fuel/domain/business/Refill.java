package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "refill")
public class Refill {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "liters")
    @NotNull
    private Integer liters;

    @Column(name = "date_time")
    private Date dateTime;

    @Column(name = "km")
    @NotNull
    private Integer km;
    @Column(name = "amount")
    @NotNull
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refill refill = (Refill) o;
        return Objects.equals(id, refill.id) &&
                Objects.equals(liters, refill.liters) &&
                Objects.equals(dateTime, refill.dateTime) &&
                Objects.equals(km, refill.km) &&
                Objects.equals(amount, refill.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, liters, dateTime, km, amount);
    }

    @Override
    public String toString() {
        return "Refill{" +
                "id=" + id +
                ", liters=" + liters +
                ", data_time=" + dateTime +
                ", km=" + km +
                ", amount=" + amount +
                '}';
    }
}
