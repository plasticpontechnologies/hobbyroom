package com.plasticon.hobbyroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.hobbyroom.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
