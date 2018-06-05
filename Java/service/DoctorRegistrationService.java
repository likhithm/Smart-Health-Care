package com.ehealth.service;

import com.ehealth.dao.DoctorRegistrationDAO;
import com.ehealth.to.PhysicianDetailsTO;

public class DoctorRegistrationService {

	public PhysicianDetailsTO savePatient(PhysicianDetailsTO physicianDetailsTO) {
		DoctorRegistrationDAO doctorRegistrationDAO = new DoctorRegistrationDAO();
		// TODO Auto-generated method stub
		return doctorRegistrationDAO.save(physicianDetailsTO);
	}

}
