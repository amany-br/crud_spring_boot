package com.project.rdv.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rdv.dao.adminRepository;
import com.project.rdv.entities.admin;

@Service
public class adminService {
	
	@Autowired
	adminRepository adminRepository;
	
	public List<admin> readAll(){
		return adminRepository.findAll();
	}
	
	public admin create(admin a ){
		return adminRepository.save(a);
	}
	public  admin update(admin a ){
		return adminRepository.save(a);
	}
	public void delete(Integer id){
		adminRepository.deleteById(id);
	}
	public admin readById(Integer id){
		return adminRepository.findById(id).get();
	}

}
