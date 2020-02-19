package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
