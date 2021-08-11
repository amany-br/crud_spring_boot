package com.project.rdv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class patient extends user  {
	
	@Column(name="cnss")
	private int CNSS;

	public patient() {
		super();
	}

	public patient(int cNSS) {
		super();
		CNSS = cNSS;
	}

	public int getCNSS() {
		return CNSS;
	}

	public void setCNSS(int cNSS) {
		CNSS = cNSS;
	}

	@Override
	public String toString() {
		return "patient [CNSS=" + CNSS + "]";
	}
	

}
