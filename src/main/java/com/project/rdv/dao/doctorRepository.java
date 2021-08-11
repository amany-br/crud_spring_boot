package com.project.rdv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.rdv.entities.doctor;

public interface doctorRepository extends JpaRepository<doctor,Integer> {

}
