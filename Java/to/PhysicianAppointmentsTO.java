package com.ehealth.to;

import java.util.Date;

public class PhysicianAppointmentsTO {
	private String physicianID;
	private Date appoitmentDate;
	private String time;
	private String patientId;
	private String status;
	private String noon;

	public String getPhysicianID() {
		return physicianID;
	}

	public void setPhysicianID(String physicianID) {
		this.physicianID = physicianID;
	}

	public Date getAppoitmentDate() {
		return appoitmentDate;
	}

	public void setAppoitmentDate(Date appoitmentDate) {
		this.appoitmentDate = appoitmentDate;
	}

	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNoon() {
		return noon;
	}

	public void setNoon(String noon) {
		this.noon = noon;
	}

}
