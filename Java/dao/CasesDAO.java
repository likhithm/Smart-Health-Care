package com.ehealth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ehealth.to.AppoitmentList;
import com.ehealth.utill.DBUtil;

public class CasesDAO {

	public List<AppoitmentList> getTodayCases(String todayDate) {
		List<AppoitmentList> appoitmentLists= new ArrayList<AppoitmentList>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			AppoitmentList appoitment=null;
			int selector=0;
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM `physicianappointments` WHERE APPOINTMENTDATE ='"+todayDate +"' AND STATUS = 'ACTIVE' ");
				while (resultSet.next()) {
					appoitment = new AppoitmentList();
					appoitment.setSelect(selector);
					appoitment.setAppoitmentDate(resultSet.getString("APPOINTMENTDATE"));
					appoitment.setAppoitmentTime(resultSet.getString("TIME")+":"+resultSet.getString("NOON"));
					appoitment.setPatientId(resultSet.getString("PATIENTID"));
					appoitment.setPhysicianId(resultSet.getString("PHYSICIANID"));
					appoitmentLists.add(appoitment);
					selector=selector+1;
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

}
