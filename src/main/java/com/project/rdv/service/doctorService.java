package com.project.rdv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rdv.entities.user;
import com.project.rdv.dao.doctorRepository;
import com.project.rdv.entities.doctor;

@Service
public class doctorService {
	
		
		@Autowired
		doctorRepository doctorRepository;
		
		public List<doctor> readAll(){
			return doctorRepository.findAll();
		}
		
		public user create(doctor d ){
			return doctorRepository.save(d);
		}
		public  doctor update(doctor d ){
			return doctorRepository.save(d);
		}
		public void delete(Integer id){
			doctorRepository.deleteById(id);
		}
		public doctor readById(Integer id){
			return doctorRepository.findById(id).get();
		}

	}



