package com.project.rdv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rdv.entities.patient;

@Repository
public interface patientRepository extends JpaRepository<patient,Integer> {

}
