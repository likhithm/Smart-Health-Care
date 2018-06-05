package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ehealth.to.PharamacyDetailsTO;
import com.ehealth.utill.DBUtil;

public class PharamacyRegistrationDAO {

	public PharamacyDetailsTO save(PharamacyDetailsTO pharamacyDetailsTO) {
		// TODO Auto-generated method stub
		try {
			String pharamacyID=null;
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT `PHARMACYID` FROM `pharmacydetails` ORDER BY PHARMACYID DESC LIMIT 1");
			while(resultSet.next()){
				pharamacyID=resultSet.getString("PHARMACYID");
			}
			if(pharamacyID != null){
				pharamacyID="PHAM"+String.valueOf((new Integer(pharamacyID.substring(4, pharamacyID.length()))+1));
				/*int l=pharamacyID.length();
				String sub=pharamacyID.substring(4, l);
				System.out.println(sub);
				pharamacyID="PHARM"+String.valueOf((new Integer(sub)+1));
				*/		int a=	statement.executeUpdate("insert into pharmacydetails(PHARMACYID,PHARAMACYNAME,PHARAMACYREGISTRATIONNUMBER,ADDRESS,PHONENUMBER,PASSWORD,EMAIL) values('"+pharamacyID+"','"+pharamacyDetailsTO.getPharamacyName()+"','"+pharamacyDetailsTO.getPharamacyRegNumber()+"','"+pharamacyDetailsTO.getAddress()+"',"+pharamacyDetailsTO.getPhoneNumber()+",'"+pharamacyDetailsTO.getPassword()+"','"+pharamacyDetailsTO.getEmail()+"')");
						if(a ==1){
							 resultSet = statement
									.executeQuery("SELECT `PHARMACYID` FROM `pharmacydetails` ORDER BY PHARMACYID DESC LIMIT 1");
							while(resultSet.next()){
								pharamacyDetailsTO.setPharamacyID(resultSet.getString("PHARMACYID"));
							}
						}
			}else{
				int a=	statement.executeUpdate("insert into pharmacydetails(PHARMACYID,PHARAMACYNAME,PHARAMACYREGISTRATIONNUMBER,ADDRESS,PHONENUMBER,PASSWORD,EMAIL) values('PHAM1','"+pharamacyDetailsTO.getPharamacyName()+"','"+pharamacyDetailsTO.getPharamacyRegNumber()+"','"+pharamacyDetailsTO.getAddress()+"','"+pharamacyDetailsTO.getPhoneNumber()+"','"+pharamacyDetailsTO.getPassword()+"','"+pharamacyDetailsTO.getEmail()+"')");
				if(a ==1){
					 resultSet = statement
							.executeQuery("SELECT `PHARMACYID` FROM `pharmacydetails` ORDER BY PHARMACYID DESC LIMIT 1");
					while(resultSet.next()){
						pharamacyDetailsTO.setPharamacyID(resultSet.getString("PHARMACYID"));
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return pharamacyDetailsTO;
	}

}
