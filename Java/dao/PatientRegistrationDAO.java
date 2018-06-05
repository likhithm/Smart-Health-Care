package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ehealth.to.PatientDetailsTO;
import com.ehealth.utill.DBUtil;

public class PatientRegistrationDAO {

	public PatientDetailsTO savePatient(PatientDetailsTO patientDetailsTO) {
		// TODO Auto-generated method stub
		try {
			String patientId=null;
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT `PATIENTID` FROM `patientdetails` ORDER BY PATIENTID DESC LIMIT 1");
			while(resultSet.next()){
				patientId	=resultSet.getString("PATIENTID");
			}
			if(patientId != null){
				patientId="PAT"+String.valueOf((new Integer(patientId.substring(3, patientId.length()))+1));	
				int a=	statement.executeUpdate("insert into patientdetails(PATIENTID,NAME,SEX,DOB,ADDRESS,MOBILE,EMAIL,PASSWORD) values('"+patientId+"','"+patientDetailsTO.getName()+"','"+patientDetailsTO.getSex()+"','"+new Date(patientDetailsTO.getDob().getTime())+"','"+patientDetailsTO.getAddress()+"','"+patientDetailsTO.getMobile()+"','"+patientDetailsTO.getEmail()+"','"+patientDetailsTO.getPassword()+"')");
				if (a == 1) {
					 resultSet = statement
							.executeQuery("SELECT `PATIENTID` FROM `patientdetails` ORDER BY PATIENTID DESC LIMIT 1");
					while (resultSet.next()) {
						patientDetailsTO.setPatientID(resultSet.getString("PATIENTID"));
					}
				}
			}else{
				
			
		int a=	statement.executeUpdate("insert into patientdetails(PATIENTID,NAME,SEX,DOB,ADDRESS,MOBILE,EMAIL,PASSWORD) values('PAT1','"+patientDetailsTO.getName()+"','"+patientDetailsTO.getSex()+"','"+new Date(patientDetailsTO.getDob().getTime())+"','"+patientDetailsTO.getAddress()+"','"+patientDetailsTO.getMobile()+"','"+patientDetailsTO.getEmail()+"','"+patientDetailsTO.getPassword()+"')");
			if (a == 1) {
				 resultSet = statement
						.executeQuery("SELECT `PATIENTID` FROM `patientdetails` ORDER BY PATIENTID DESC LIMIT 1");
				while (resultSet.next()) {
					patientDetailsTO.setPatientID(resultSet.getString("PATIENTID"));
				}
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patientDetailsTO;
	}

}
