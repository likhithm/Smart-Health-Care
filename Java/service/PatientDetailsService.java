package com.ehealth.service;

import java.util.List;

import com.ehealth.dao.PatientDetailsDAO;
import com.ehealth.to.MedicalDiagnosisTO;
import com.ehealth.to.PatientDetailsTO;

public class PatientDetailsService {

	public PatientDetailsTO getPatientDetails(String patientID) {
PatientDetailsDAO detailsDAO= new PatientDetailsDAO();
		return detailsDAO.getPatientDetails(patientID);
	}

	public List<MedicalDiagnosisTO> getMedicalDiagnosis(String doctorID,
			String patientID) {
		PatientDetailsDAO detailsDAO= new PatientDetailsDAO();
		return detailsDAO.getMedicalDiagnosis(doctorID,patientID);
	}

}
