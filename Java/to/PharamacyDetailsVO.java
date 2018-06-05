package com.ehealth.to;

public class PharamacyDetailsVO {
	private String pharmacistId;
	private String patientId;
	private String patientName;
	private String physicianName;
	private String medicine;
	private String dosage;
	
	public String getPharmacistId() {
		return pharmacistId ;
	}

	public void setPharmacistId(String PharmacistId) {
		this.pharmacistId = pharmacistId;
	}
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

}
