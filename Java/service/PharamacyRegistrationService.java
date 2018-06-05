package com.ehealth.service;

import com.ehealth.dao.PharamacyRegistrationDAO;
import com.ehealth.to.PharamacyDetailsTO;

public class PharamacyRegistrationService {

	public PharamacyDetailsTO save(PharamacyDetailsTO pharamacyDetailsTO) {
		PharamacyRegistrationDAO pharamacyRegistrationDAO =new PharamacyRegistrationDAO();
		// TODO Auto-generated method stub
		return pharamacyRegistrationDAO.save(pharamacyDetailsTO);
	}

}
