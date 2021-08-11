package com.project.rdv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rdv.entities.rdv;

@Repository
public interface rdvRepository extends JpaRepository<rdv, Integer> {

}
