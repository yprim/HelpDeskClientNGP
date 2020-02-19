package com.ucr.fuel.repository;


import com.ucr.fuel.domain.business.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClientRepository extends JpaRepository<UserClient, Integer> {


}
