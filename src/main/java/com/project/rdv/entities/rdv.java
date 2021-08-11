package com.project.rdv.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class rdv {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "hour")
	private String StartHour;
	
	@Column(name="status")
	private RdvStatus status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartHour() {
		return StartHour;
	}

	public void setStartHour(String startHour) {
		StartHour = startHour;
	}

	public RdvStatus getStatus() {
		return status;
	}

	public void setStatus(RdvStatus status) {
		this.status = status;
	}
	

	
	

}
