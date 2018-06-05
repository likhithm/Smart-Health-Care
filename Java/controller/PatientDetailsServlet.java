package com.ehealth.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.PatientDetailsService;
import com.ehealth.to.MedicalDiagnosisTO;
import com.ehealth.to.PatientDetailsTO;

public class PatientDetailsServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String patientID= request.getParameter("patientID");
		PatientDetailsService detailsService=new PatientDetailsService(); 
		PatientDetailsTO detailsTO=detailsService.getPatientDetails(patientID);
		HttpSession session = request.getSession();
		String doctorID = (String) session.getAttribute("doctorID");
		List<MedicalDiagnosisTO> diagnosisTOs = detailsService.getMedicalDiagnosis(doctorID,patientID);
		HttpSession httpSession=request.getSession();
			httpSession.setAttribute("diagnosisTOslist", diagnosisTOs);
		httpSession.setAttribute("detailsTO", detailsTO);
		if(detailsTO != null){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/patientDetails.jsp");
			dispatcher.forward(request, response);

		}
		else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/doctorLoginSuccess.jsp");
		dispatcher.forward(request, response);

		}
		}

	}

