package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ehealth.to.PhysicianPrescriptionTO;
import com.ehealth.utill.DBUtil;

public class MedicalPrescriptionDAO {

	public PhysicianPrescriptionTO save(
			PhysicianPrescriptionTO physicianPrescriptionTO) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
		int a=	statement.executeUpdate("insert into physicianprescription(PATIENTIDS,PHYSICIANID,MEDICINE,DOSAGE,TIMESOFDAY,PHARAMACYID,DATE) values('"+physicianPrescriptionTO.getPatientID()+"' ,'"+physicianPrescriptionTO.getPhysicianID()+"' ,'"+physicianPrescriptionTO.getMedicine()+"','"+physicianPrescriptionTO.getDosage()+"','"+physicianPrescriptionTO.getTimesOfDay()+"','"+physicianPrescriptionTO.getPharmacyID()+"','"+new Date(physicianPrescriptionTO.getDate().getTime())+"')");
			if (a == 1) {
				Statement statement2=connection.createStatement();
		int b =		statement2.executeUpdate("UPDATE `medicaldiagnosis` SET `MEDICAL_DIAGNOSIS`='"+physicianPrescriptionTO.getMedicine()+"',`DIAGNOSIS_DATE`= '"+new Date(physicianPrescriptionTO.getDate().getTime())+"' , STATUS =' CLOSED ' , DOSAGE = '"+physicianPrescriptionTO.getDosage()+"' , TIMESOFDAY = '"+physicianPrescriptionTO.getTimesOfDay()+"' , PHARAMACYID = '"+physicianPrescriptionTO.getPharmacyID()+"' WHERE `PATIENTID` ='"+physicianPrescriptionTO.getPatientID()+"' AND `PHYSICIAN_ID` = '"+physicianPrescriptionTO.getPhysicianID()+"' ");
		if(b != 0){	
b=0;
Statement statement3 =connection.createStatement();
b=statement3.executeUpdate("UPDATE `physicianappointments` SET `STATUS` = 'CLOSED' WHERE `PATIENTID`='"+physicianPrescriptionTO.getPatientID()+"' AND `PHYSICIANID` = '"+physicianPrescriptionTO.getPhysicianID()+"'");

		ResultSet resultSet = statement
						.executeQuery("SELECT `PRESCRIPTIONID` FROM `physicianprescription` ORDER BY PRESCRIPTIONID DESC LIMIT 1");
				while (resultSet.next()) {
					physicianPrescriptionTO.setPrescriptionID(resultSet.getInt("PRESCRIPTIONID"));
				}
		}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return physicianPrescriptionTO;
	}

}
