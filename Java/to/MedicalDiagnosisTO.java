package com.ehealth.to;

import java.util.Date;

public class MedicalDiagnosisTO {
	private int MedicalDiagID;
	private String patientID;
	private int no;
	private String symptoms;
	private String previousMedicines;
	private String medicalDiagnosis;
	private String physicianId;
	private Date diagnosisDate;
	private String status;
	private String dosage;
	private String timeOfDay;
	private String pharmacistId;

	public int getMedicalDiagID() {
		return MedicalDiagID;
	}

	public void setMedicalDiagID(int medicalDiagID) {
		MedicalDiagID = medicalDiagID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getPreviousMedicines() {
		return previousMedicines;
	}

	public void setPreviousMedicines(String previousMedicines) {
		this.previousMedicines = previousMedicines;
	}

	public String getMedicalDiagnosis() {
		return medicalDiagnosis;
	}

	public void setMedicalDiagnosis(String medicalDiagnosis) {
		this.medicalDiagnosis = medicalDiagnosis;
	}

	public String getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}

	public Date getDiagnosisDate() {
		return diagnosisDate;
	}

	public void setDiagnosisDate(Date diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public String getPharmacistId() {
		return pharmacistId;
	}

	public void setPharmacistId(String pharmacistId) {
		this.pharmacistId = pharmacistId;
	}

}
