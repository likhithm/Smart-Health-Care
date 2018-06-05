package com.ehealth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ehealth.to.AppoitmentList;
import com.ehealth.to.MedicalDiagnosisTO;
import com.ehealth.utill.DBUtil;

public class DiagonosisDAO {

	public List<MedicalDiagnosisTO> getDiagnosoes(String patientID) {
		List<MedicalDiagnosisTO> appoitmentLists= new ArrayList<MedicalDiagnosisTO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			MedicalDiagnosisTO appoitment=null;
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM `medicaldiagnosis` WHERE PATIENTID='"+patientID+"'");
				while (resultSet.next()) {
					appoitment= new MedicalDiagnosisTO();
					appoitment.setPatientID(resultSet.getString("PATIENTID"));
					appoitment.setSymptoms(resultSet.getString("SYMPTOMS"));
					appoitment.setPreviousMedicines(resultSet.getString("PREVIOUS_MEDICINES"));
					appoitment.setMedicalDiagnosis(resultSet.getString("MEDICAL_DIAGNOSIS"));
					appoitment.setDiagnosisDate(resultSet.getDate("DIAGNOSIS_DATE"));
					appoitment.setPhysicianId(resultSet.getString("PHYSICIAN_ID"));
					appoitment.setDosage(resultSet.getString("DOSAGE"));
					appoitment.setTimeOfDay(resultSet.getString("TIMESOFDAY"));
					appoitment.setPharmacistId(resultSet.getString("PHARAMACYID"));
					appoitmentLists.add(appoitment);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

}
