package com.ehealth.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ehealth.to.MedicalDiagnosisTO;
import com.ehealth.utill.DBUtil;

public class MedicalAdviceDAO {

	public MedicalDiagnosisTO save(MedicalDiagnosisTO medicalDiagnosisTO) {
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
		int a=	statement.executeUpdate("insert into medicaldiagnosis(PATIENTID,NO,SYMPTOMS,PREVIOUS_MEDICINES,PHYSICIAN_ID,STATUS) values('"+medicalDiagnosisTO.getPatientID()+"',"+1+",'"+medicalDiagnosisTO.getSymptoms()+"','"+medicalDiagnosisTO.getPreviousMedicines()+"', '"+medicalDiagnosisTO.getPhysicianId()+"' ,'ACTIVE')");
			if (a == 1) {
				ResultSet resultSet = statement
						.executeQuery("SELECT `MEDICALDIAG_ID` FROM `medicaldiagnosis` ORDER BY MEDICALDIAG_ID DESC LIMIT 1");
				while (resultSet.next()) {
					medicalDiagnosisTO.setMedicalDiagID(resultSet.getInt("MEDICALDIAG_ID"));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return medicalDiagnosisTO;
	}

}
