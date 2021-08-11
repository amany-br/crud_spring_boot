package com.project.rdv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class doctor extends user{
	
	@Column (name="cin")
	private int CIN;
	
	@Column (name="enable")
	private boolean enable;
	
	@Column (name="VisitPrice")
	private double VisitPrice;

	public doctor() {
		super();
	}

	public doctor(int cIN, boolean enable, double visitPrice) {
		super();
		CIN = cIN;
		this.enable = enable;
		VisitPrice = visitPrice;
	}

	public int getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public double getVisitPrice() {
		return VisitPrice;
	}

	public void setVisitPrice(double visitPrice) {
		VisitPrice = visitPrice;
	}

	@Override
	public String toString() {
		return "doctor [CIN=" + CIN + ", enable=" + enable + ", VisitPrice=" + VisitPrice + "]";
	}

}
