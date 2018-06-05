package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.Time;

import com.ehealth.to.PhysicianAppointmentsTO;
import com.ehealth.utill.DBUtil;

public class PhysicianAppoitmentDAO {

	public PhysicianAppointmentsTO getAppoitment(
			PhysicianAppointmentsTO appointmentsTO) {
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
		int a=	statement.executeUpdate("insert into physicianappointments(PHYSICIANID,APPOINTMENTDATE,TIME,PATIENTID,STATUS,NOON) values('"+appointmentsTO.getPhysicianID()+"' ,'"+new Date(appointmentsTO.getAppoitmentDate().getTime())+"','"+appointmentsTO.getTime()+"','"+appointmentsTO.getPatientId()+"' ,'ACTIVE','"+appointmentsTO.getNoon()+"')");
			if (a == 1) {
				return appointmentsTO;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

}
