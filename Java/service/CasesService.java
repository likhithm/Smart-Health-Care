package com.ehealth.service;

import java.util.List;

import com.ehealth.dao.CasesDAO;
import com.ehealth.to.AppoitmentList;

public class CasesService {

	public List<AppoitmentList> getTodayCases(String todayDate) {
		CasesDAO casesDAO = new CasesDAO();
		return casesDAO.getTodayCases(todayDate);
	}

}
