package com.project.rdv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rdv.entities.admin;

@Repository
public interface adminRepository extends JpaRepository<admin,Integer> {

}

