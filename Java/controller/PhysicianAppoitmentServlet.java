package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.PhysicianAppoitmentService;
import com.ehealth.to.PhysicianAppointmentsTO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhysicianAppoitmentServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("inside a PhysicianAppoitmentServlet");
	
	PhysicianAppointmentsTO appointmentsTO= new PhysicianAppointmentsTO();
	appointmentsTO.setPhysicianID(request.getParameter("physicianid"));
	String currentDateText = request.getParameter("appDate");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	try {
		Date date = sdf.parse(currentDateText);
		appointmentsTO.setAppoitmentDate(date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String AM =request.getParameter("AM");
	String PM =request.getParameter("PM");
	if(AM != null){
		appointmentsTO.setNoon(AM);
		appointmentsTO.setTime("7");
	}else if(PM != null){
		appointmentsTO.setNoon(PM);
		appointmentsTO.setTime("1");
	}
	HttpSession session =request.getSession();
String patientID=	 (String) session.getAttribute("patientID");
if(patientID != null){
	appointmentsTO.setPatientId(patientID);
	appointmentsTO = PhysicianAppoitmentService.getAppoitment(appointmentsTO);
	if(appointmentsTO != null){
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("./jsp/getAppointmentSuccess.jsp");
		dispatcher.forward(request, response);
	}else{
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("./jsp/getAppointmentFailure.jsp");
		dispatcher.forward(request, response);
	}
}
}
}
