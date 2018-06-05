package com.ehealth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ehealth.to.MedicalDiagnosisTO;
import com.ehealth.to.PatientDetailsTO;
import com.ehealth.utill.DBUtil;

public class PatientDetailsDAO {

	public PatientDetailsTO getPatientDetails(String patientID) {
		Connection connection=null;
		PatientDetailsTO detailsTO = null;
		
			try {
				connection= DBUtil.getConnection();
				Statement statement= connection.createStatement();
				ResultSet resultSet =statement.executeQuery("select * from patientdetails where PATIENTID = '"+patientID+"'");
				while(resultSet.next()){
					detailsTO	= new PatientDetailsTO();
					detailsTO.setPatientID(resultSet.getString("PATIENTID"));
					detailsTO.setName(resultSet.getString("NAME"));
					detailsTO.setSex(resultSet.getString("SEX"));
					detailsTO.setDob1(resultSet.getString("DOB"));
					detailsTO.setAddress(resultSet.getString("ADDRESS"));
					detailsTO.setMobile(resultSet.getString("MOBILE"));
					detailsTO.setEmail(resultSet.getString("EMAIL"));
					detailsTO.setPassword(resultSet.getString("PASSWORD"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return detailsTO;
	}

	public List<MedicalDiagnosisTO> getMedicalDiagnosis(String doctorID,
			String patientID) {
		List<MedicalDiagnosisTO> appoitmentLists= new ArrayList<MedicalDiagnosisTO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			MedicalDiagnosisTO appoitment=null;
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM `medicaldiagnosis` WHERE `PATIENTID` = '"+patientID+"' AND `PHYSICIAN_ID` = '"+doctorID+"' AND `STATUS` = 'ACTIVE'");
				while (resultSet.next()) {
					appoitment= new MedicalDiagnosisTO();
					appoitment.setPatientID(resultSet.getString("PATIENTID"));
					appoitment.setSymptoms(resultSet.getString("SYMPTOMS"));
					appoitment.setPreviousMedicines(resultSet.getString("PREVIOUS_MEDICINES"));
					appoitment.setPhysicianId(resultSet.getString("PHYSICIAN_ID"));
					appoitmentLists.add(appoitment);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

}
