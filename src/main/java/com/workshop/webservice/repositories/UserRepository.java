package com.workshop.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
