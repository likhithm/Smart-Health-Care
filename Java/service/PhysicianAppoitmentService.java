package com.ehealth.service;

import com.ehealth.dao.PhysicianAppoitmentDAO;
import com.ehealth.to.PhysicianAppointmentsTO;

public class PhysicianAppoitmentService {

	public static PhysicianAppointmentsTO getAppoitment(
			PhysicianAppointmentsTO appointmentsTO) {
		// TODO Auto-generated method stub
		PhysicianAppoitmentDAO appoitmentDAO= new PhysicianAppoitmentDAO();
		return appoitmentDAO.getAppoitment(appointmentsTO);
	}

}
