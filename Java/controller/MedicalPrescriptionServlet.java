package com.ehealth.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.service.MedicalPrescriptionService;
import com.ehealth.to.PhysicianPrescriptionTO;

public class MedicalPrescriptionServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside MedicalPrescriptionServlet ");
		PhysicianPrescriptionTO physicianPrescriptionTO = new PhysicianPrescriptionTO();
		physicianPrescriptionTO.setPatientID(request.getParameter("PatientID"));
		physicianPrescriptionTO.setPhysicianID(request.getParameter("physicianid"));
		physicianPrescriptionTO.setPharmacyID((request.getParameter("PharmacyID")));
		physicianPrescriptionTO.setMedicine(request.getParameter("medicine"));
		physicianPrescriptionTO.setDosage(request.getParameter("dosage"));
		physicianPrescriptionTO.setTimesOfDay(request.getParameter("TimeofDay"));
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String preDate=dateFormat.format(date); 
		try {
			Date startDate = dateFormat.parse(preDate);
			physicianPrescriptionTO.setDate(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MedicalPrescriptionService medicalPrescriptionService= new MedicalPrescriptionService();
		physicianPrescriptionTO=medicalPrescriptionService.save(physicianPrescriptionTO);
		if(physicianPrescriptionTO.getPrescriptionID() != 0){

			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/MedicalPrescriptionSuccess.jsp");
			dispatcher.forward(request, response);

		
		}else{

			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/doctorLoginSuccess.jsp");
			dispatcher.forward(request, response);

		
		}
	}
}
