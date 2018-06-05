package com.ehealth.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.service.PatientRegistrationService;
import com.ehealth.to.PatientDetailsTO;

public class PatientRegistrationServlet extends HttpServlet{

	PatientDetailsTO  patientDetailsTO = new PatientDetailsTO();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientRegistrationService patientRegistrationService = new PatientRegistrationService();
		patientDetailsTO.setName(request.getParameter("patient_name"));
		patientDetailsTO.setPassword(request.getParameter("password"));
		patientDetailsTO.setSex(request.getParameter("sex"));
		try {
			String currentDateText = request.getParameter("dob");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(currentDateText);
			patientDetailsTO.setDob(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		patientDetailsTO.setAddress(request.getParameter("address"));
		patientDetailsTO.setMobile(request.getParameter("mobile"));
		patientDetailsTO.setEmail(request.getParameter("email"));
		PatientDetailsTO detailsTO =patientRegistrationService.savePatient(patientDetailsTO);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("./patientLogin.html");
		dispatcher.forward(request, response);
	
	}
}
