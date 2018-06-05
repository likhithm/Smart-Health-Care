package com.ehealth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ehealth.to.LoginDetailsTO;
import com.ehealth.utill.DBUtil;

public class LoginCheckDAO {

	public boolean checkLogin(LoginDetailsTO loginDetailsTO) {
		Connection connection=null;
		try {
			 connection= DBUtil.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(loginDetailsTO.getType().equalsIgnoreCase("patient")){
			try {
				Statement statement= connection.createStatement();
				ResultSet resultSet =statement.executeQuery("select * from patientdetails where PATIENTID ='"+loginDetailsTO.getLoginId()+"'  and PASSWORD ='"+loginDetailsTO.getPassword()+"'");
				while(resultSet.next()){
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//statement.executeQuery("");
		}else if(loginDetailsTO.getType().equalsIgnoreCase("doctor")){

			try {
				Statement statement= connection.createStatement();
			
				ResultSet resultSet2=	statement.executeQuery("select * from physiciandetails where PHYSICIAN_ID = '"+loginDetailsTO.getLoginId()+"'  and PASSWORD ='"+loginDetailsTO.getPassword()+"'");
				while(resultSet2.next()){
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//statement.executeQuery("");
		
			
		}else if(loginDetailsTO.getType().equalsIgnoreCase("pharmacy")){
			try {
				Statement statement= connection.createStatement();
				ResultSet resultSet =statement.executeQuery("select * from pharmacydetails where PHARMACYID = '"+loginDetailsTO.getLoginId()+"'  and PASSWORD ='"+loginDetailsTO.getPassword()+"'");
				while(resultSet.next()){
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		}
		else{
			
		}
		return false;
	}

}
