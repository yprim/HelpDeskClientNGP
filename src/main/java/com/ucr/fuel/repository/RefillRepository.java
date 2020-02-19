package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.Refill;
import com.ucr.fuel.domain.business.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RefillRepository extends JpaRepository<Refill, Integer> {

    List<Refill> findAllByRoute(Route route);

    @Query("SELECT r FROM Refill r INNER JOIN  r.route o INNER JOIN  o.driver d where d.id=:driverId")
//    @Query("SELECT r FROM Refill r JOIN FETCH r.route o JOIN FETCH o.driver d where d.id=:driverId")
    List<Refill> findAllByDriver(@Param("driverId") Integer driverId);


}

