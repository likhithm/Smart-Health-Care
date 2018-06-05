package com.ehealth.service;

import com.ehealth.dao.MedicalPrescriptionDAO;
import com.ehealth.to.PhysicianPrescriptionTO;

public class MedicalPrescriptionService {

	public PhysicianPrescriptionTO save(
			PhysicianPrescriptionTO physicianPrescriptionTO) {
		// TODO Auto-generated method stub
		MedicalPrescriptionDAO dao= new MedicalPrescriptionDAO();
		return dao.save(physicianPrescriptionTO);
	}

}
