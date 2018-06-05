package com.ehealth.service;

import java.util.Date;
import java.util.List;

import com.ehealth.dao.AppoitmentDAO;
import com.ehealth.to.AppoitmentList;

public class AppoitmentService {

	public List<AppoitmentList> getAppoitmentList(Date startDate, Date endDate) {
		AppoitmentDAO appoitmentDAO= new AppoitmentDAO();
		return appoitmentDAO.getAppoitmentList(startDate,endDate);
	}

}
