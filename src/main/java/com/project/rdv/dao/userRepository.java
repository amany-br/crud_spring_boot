package com.project.rdv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rdv.entities.user;

@Repository
public interface userRepository extends JpaRepository<user,Integer> {

}
