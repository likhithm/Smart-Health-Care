package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ehealth.to.PhysicianDetailsTO;
import com.ehealth.utill.DBUtil;

public class DoctorRegistrationDAO {

	public PhysicianDetailsTO save(PhysicianDetailsTO physicianDetailsTO) {
		// TODO Auto-generated method stub
		try {
			String physicianId = null;
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT `PHYSICIAN_ID` FROM `physiciandetails` ORDER BY PHYSICIAN_ID DESC LIMIT 1");
			while(resultSet.next()){
				physicianId=resultSet.getString("PHYSICIAN_ID");
			}
			if(physicianId != null){
				physicianId="PHY"+String.valueOf((new Integer(physicianId.substring(3, physicianId.length()))+1));
				int a=	statement.executeUpdate("insert into physiciandetails(PHYSICIAN_ID,PASSWORD,NAME,SEX,DOB,ADDRESS,PHONE,QUALIFICATON,EMAIL) values('"+physicianId+"','"+physicianDetailsTO.getPassword()+"','"+physicianDetailsTO.getName()+"','"+physicianDetailsTO.getSex()+"','"+new Date(physicianDetailsTO.getDob().getTime())+"','"+physicianDetailsTO.getAddress()+"','"+physicianDetailsTO.getPhone()+"','"+physicianDetailsTO.getQualification()+"','"+physicianDetailsTO.getEmail()+"')");
				if (a == 1) {
					 resultSet = statement
							.executeQuery("SELECT `PHYSICIAN_ID` FROM `physiciandetails` ORDER BY PHYSICIAN_ID DESC LIMIT 1");
					while (resultSet.next()) {
						physicianDetailsTO.setPhysicianID(resultSet.getString("PHYSICIAN_ID"));
					}
				}

			}
			else{
		int a=	statement.executeUpdate("insert into physiciandetails(PHYSICIAN_ID,PASSWORD,NAME,SEX,DOB,ADDRESS,PHONE,QUALIFICATON,EMAIL) values('PHY1','"+physicianDetailsTO.getPassword()+"','"+physicianDetailsTO.getName()+"','"+physicianDetailsTO.getSex()+"','"+new Date(physicianDetailsTO.getDob().getTime())+"','"+physicianDetailsTO.getAddress()+"','"+physicianDetailsTO.getPhone()+"','"+physicianDetailsTO.getQualification()+"','"+physicianDetailsTO.getEmail()+"')");
			if (a == 1) {
				 resultSet = statement
						.executeQuery("SELECT `PHYSICIAN_ID` FROM `physiciandetails` ORDER BY PHYSICIAN_ID DESC LIMIT 1");
				while (resultSet.next()) {
					physicianDetailsTO.setPhysicianID(resultSet.getString("PHYSICIAN_ID"));
				}
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return physicianDetailsTO;
	}

}
