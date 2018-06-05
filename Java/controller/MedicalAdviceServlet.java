package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.service.MedicalAdviceService;
import com.ehealth.to.MedicalDiagnosisTO;

public class MedicalAdviceServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside a MedicalAdviceServlet");
		MedicalDiagnosisTO medicalDiagnosisTO= new MedicalDiagnosisTO();
		medicalDiagnosisTO.setPatientID(request.getParameter("patientID"));
		medicalDiagnosisTO.setSymptoms((request.getParameter("symptoms1"))+","+(request.getParameter("symptoms2"))+","+(request.getParameter("symnotlisted")));
		medicalDiagnosisTO.setPreviousMedicines(request.getParameter("previousmedicine"));
		medicalDiagnosisTO.setPhysicianId(request.getParameter("physicianid"));
		MedicalAdviceService adviceService=new MedicalAdviceService();
		medicalDiagnosisTO=adviceService.save(medicalDiagnosisTO);
		if(medicalDiagnosisTO.getMedicalDiagID() != 0){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/patientLoginSuccess1.jsp");
			dispatcher.forward(request, response);

		}else{
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("./index.html");
			dispatcher.forward(request, response);
		
		}
	}
}
