package com.ehealth.service;

import com.ehealth.dao.MedicalAdviceDAO;
import com.ehealth.to.MedicalDiagnosisTO;

public class MedicalAdviceService {

	public MedicalDiagnosisTO save(MedicalDiagnosisTO medicalDiagnosisTO) {
		MedicalAdviceDAO adviceDAO= new MedicalAdviceDAO();
		// TODO Auto-generated method stub
		return adviceDAO.save(medicalDiagnosisTO);
	}

}
