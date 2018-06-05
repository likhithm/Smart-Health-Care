package com.ehealth.to;

import java.util.Date;

public class PhysicianPrescriptionTO {
	private int prescriptionID;
	private String patientID;
	private String physicianID;
	private String pharmacyID;
	private String medicine;
	private String dosage;
	private String timesOfDay;
	private Date date;

	public int getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(int prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getPhysicianID() {
		return physicianID;
	}

	public void setPhysicianID(String physicianID) {
		this.physicianID = physicianID;
	}

	public String getPharmacyID() {
		return pharmacyID;
	}

	public void setPharmacyID(String pharmacyID) {
		this.pharmacyID = pharmacyID;
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

	public String getTimesOfDay() {
		return timesOfDay;
	}

	public void setTimesOfDay(String timesOfDay) {
		this.timesOfDay = timesOfDay;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
