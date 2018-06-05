package com.ehealth.to;

public class AppoitmentList {
	private int select;
	private String physicianId;
	private String appoitmentDate;
	private String appoitmentTime;
	private String patientId;

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	public String getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}

	public String getAppoitmentDate() {
		return appoitmentDate;
	}

	public void setAppoitmentDate(String appoitmentDate) {
		this.appoitmentDate = appoitmentDate;
	}

	public String getAppoitmentTime() {
		return appoitmentTime;
	}

	public void setAppoitmentTime(String appoitmentTime) {
		this.appoitmentTime = appoitmentTime;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

}
