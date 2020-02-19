package com.ucr.fuel.repository;
import com.ucr.fuel.domain.business.CommentsClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsClientRepository extends JpaRepository<CommentsClient, Integer>{

}
