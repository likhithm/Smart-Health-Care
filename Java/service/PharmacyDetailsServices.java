package com.ehealth.service;

import java.util.Date;
import java.util.List;

import com.ehealth.dao.PharmacyDetailsDAO;
import com.ehealth.to.PharamacyDetailsVO;

public class PharmacyDetailsServices {

	public List<PharamacyDetailsVO> getDetails(String todayDate) {
		PharmacyDetailsDAO dao = new PharmacyDetailsDAO();
		return dao.getDetails(todayDate);
	}

	public List<PharamacyDetailsVO> getDetailsByWeek(Date startDate,
			Date endDate) {
		PharmacyDetailsDAO dao = new PharmacyDetailsDAO();
		return dao.getDetailsByWeek(startDate,endDate);
	}

	public List<PharamacyDetailsVO> getDetailsAll() {
		PharmacyDetailsDAO dao = new PharmacyDetailsDAO();
		return dao.getDetailsAll();
	}

	public List<PharamacyDetailsVO> getDetailsByWeek(Date startDate) {
		PharmacyDetailsDAO dao = new PharmacyDetailsDAO();
		return dao.getDetailsByWeek(startDate);
	}

}
