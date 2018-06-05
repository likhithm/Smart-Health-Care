package com.ehealth.service;

import com.ehealth.dao.PatientRegistrationDAO;
import com.ehealth.to.PatientDetailsTO;

public class PatientRegistrationService {

	public PatientDetailsTO savePatient(PatientDetailsTO patientDetailsTO) {
		PatientRegistrationDAO patientRegistrationDAO = new PatientRegistrationDAO();
		// TODO Auto-generated method stub
		return patientRegistrationDAO.savePatient(patientDetailsTO);
	}

}
