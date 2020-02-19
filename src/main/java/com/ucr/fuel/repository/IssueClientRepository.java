package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.IssueClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueClientRepository extends JpaRepository<IssueClient, Integer> {


}
