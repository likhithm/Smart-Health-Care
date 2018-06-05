package com.ehealth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ehealth.to.AppoitmentList;
import com.ehealth.to.PharamacyDetailsVO;
import com.ehealth.utill.DBUtil;

public class PharmacyDetailsDAO {
	PharamacyDetailsVO vo;
	public List<PharamacyDetailsVO> getDetails(String todayDate) {
		List<PharamacyDetailsVO> appoitmentLists= new ArrayList<PharamacyDetailsVO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			PharamacyDetailsVO pharamacyDetailsVO;
				ResultSet resultSet = statement
						.executeQuery("SELECT pd.`PATIENTID`,pd.`NAME`,`ph`.`NAME`,p.`MEDICINE`,p.`DOSAGE` FROM `physicianprescription` p JOIN `patientdetails` pd ON p.`PATIENTIDS`=pd.`PATIENTID` JOIN `physiciandetails` ph ON p.`PHYSICIANID` = ph.`PHYSICIAN_ID` WHERE p.`DATE`='"+todayDate+"'  "  );
				while (resultSet.next()) {
					pharamacyDetailsVO = new PharamacyDetailsVO();
					pharamacyDetailsVO.setPatientId(resultSet.getString(1));
					pharamacyDetailsVO.setPatientName(resultSet.getString(2));
					pharamacyDetailsVO.setPhysicianName(resultSet.getString(3));
					pharamacyDetailsVO.setMedicine(resultSet.getString(4));
					pharamacyDetailsVO.setDosage(resultSet.getString(5));
					appoitmentLists.add(pharamacyDetailsVO);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

	public List<PharamacyDetailsVO> getDetailsByWeek(Date startDate,
			Date endDate) {
		List<PharamacyDetailsVO> appoitmentLists= new ArrayList<PharamacyDetailsVO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			PharamacyDetailsVO pharamacyDetailsVO;
				ResultSet resultSet = statement
						.executeQuery("SELECT pd.`PATIENTID`,pd.`NAME`,`ph`.`NAME`,p.`MEDICINE`,p.`DOSAGE` FROM `physicianprescription` p JOIN `patientdetails` pd ON p.`PATIENTIDS`=pd.`PATIENTID` JOIN `physiciandetails` ph ON p.`PHYSICIANID` = ph.`PHYSICIAN_ID` WHERE  ( p.DATE BETWEEN '"+new  java.sql.Date(startDate.getTime())+"'  AND '"+new  java.sql.Date(endDate.getTime())+"')");
				while (resultSet.next()) {
					pharamacyDetailsVO = new PharamacyDetailsVO();
					pharamacyDetailsVO.setPatientId(resultSet.getString(1));
					pharamacyDetailsVO.setPatientName(resultSet.getString(2));
					pharamacyDetailsVO.setPhysicianName(resultSet.getString(3));
					pharamacyDetailsVO.setMedicine(resultSet.getString(4));
					pharamacyDetailsVO.setDosage(resultSet.getString(5));
					appoitmentLists.add(pharamacyDetailsVO);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

	public List<PharamacyDetailsVO> getDetailsAll() {
		List<PharamacyDetailsVO> appoitmentLists= new ArrayList<PharamacyDetailsVO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			PharamacyDetailsVO pharamacyDetailsVO;
				ResultSet resultSet = statement
						.executeQuery("SELECT pd.`PATIENTID`,pd.`NAME`,`ph`.`NAME`,p.`MEDICINE`,p.`DOSAGE` FROM `physicianprescription` p JOIN `patientdetails` pd ON p.`PATIENTIDS`=pd.`PATIENTID` JOIN `physiciandetails` ph ON p.`PHYSICIANID` = ph.`PHYSICIAN_ID`");
				while (resultSet.next()) {
					pharamacyDetailsVO = new PharamacyDetailsVO();
					pharamacyDetailsVO.setPatientId(resultSet.getString(1));
					pharamacyDetailsVO.setPatientName(resultSet.getString(2));
					pharamacyDetailsVO.setPhysicianName(resultSet.getString(3));
					pharamacyDetailsVO.setMedicine(resultSet.getString(4));
					pharamacyDetailsVO.setDosage(resultSet.getString(5));
					appoitmentLists.add(pharamacyDetailsVO);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

	public List<PharamacyDetailsVO> getDetailsByWeek(Date startDate) {
		List<PharamacyDetailsVO> appoitmentLists= new ArrayList<PharamacyDetailsVO>();
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			PharamacyDetailsVO pharamacyDetailsVO;
				ResultSet resultSet = statement
						.executeQuery("SELECT pd.`PATIENTID`,pd.`NAME`,`ph`.`NAME`,p.`MEDICINE`,p.`DOSAGE` FROM `physicianprescription` p JOIN `patientdetails` pd ON p.`PATIENTIDS`=pd.`PATIENTID` JOIN `physiciandetails` ph ON p.`PHYSICIANID` = ph.`PHYSICIAN_ID` WHERE  p.DATE = '"+new  java.sql.Date(startDate.getTime())+"'");
				while (resultSet.next()) {
					pharamacyDetailsVO = new PharamacyDetailsVO();
					pharamacyDetailsVO.setPatientId(resultSet.getString(1));
					pharamacyDetailsVO.setPatientName(resultSet.getString(2));
					pharamacyDetailsVO.setPhysicianName(resultSet.getString(3));
					pharamacyDetailsVO.setMedicine(resultSet.getString(4));
					pharamacyDetailsVO.setDosage(resultSet.getString(5));
					appoitmentLists.add(pharamacyDetailsVO);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return appoitmentLists;
	}

}
