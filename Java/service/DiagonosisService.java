package com.ehealth.service;

import java.util.List;

import com.ehealth.dao.DiagonosisDAO;
import com.ehealth.to.MedicalDiagnosisTO;

public class DiagonosisService {

	public List<MedicalDiagnosisTO> getDiagnosoes(String patientID) {
		// TODO Auto-generated method stub
		return new DiagonosisDAO().getDiagnosoes(patientID);
	}

}
