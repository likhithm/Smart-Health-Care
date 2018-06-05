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

import com.ehealth.service.DoctorRegistrationService;
import com.ehealth.service.PatientRegistrationService;
import com.ehealth.to.PatientDetailsTO;
import com.ehealth.to.PhysicianDetailsTO;

public class DoctorRegistrationServlet extends HttpServlet{
	PhysicianDetailsTO physicianDetailsTO = new PhysicianDetailsTO();
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
DoctorRegistrationService doctorRegistrationService = new DoctorRegistrationService();
	physicianDetailsTO.setName(request.getParameter("physician_name"));
	physicianDetailsTO.setPassword(request.getParameter("password"));
	physicianDetailsTO.setSex(request.getParameter("sex"));
	try {
		String currentDateText = request.getParameter("dob");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(currentDateText);
		physicianDetailsTO.setDob(date);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	physicianDetailsTO.setAddress(request.getParameter("address"));
	physicianDetailsTO.setPhone(request.getParameter("mobile"));
	physicianDetailsTO.setEmail(request.getParameter("email"));
	physicianDetailsTO.setQualification(request.getParameter("qualification"));
	PhysicianDetailsTO  detailsTO =doctorRegistrationService.savePatient(physicianDetailsTO);
//	doctorRegistrationService.update(physicianDetailsTO);
	RequestDispatcher dispatcher = request
			.getRequestDispatcher("./physicianLogin.html");
	dispatcher.forward(request, response);


}
}
