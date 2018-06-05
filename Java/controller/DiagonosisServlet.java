package com.ehealth.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.DiagonosisService;
import com.ehealth.to.MedicalDiagnosisTO;

public class DiagonosisServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DiagonosisService diagonosisService = new DiagonosisService();
		HttpSession session = request.getSession();
		String patientID = (String) session.getAttribute("patientID");
		HttpSession httpSession=request.getSession();
		List<MedicalDiagnosisTO> diagnosisTOs = diagonosisService
				.getDiagnosoes(patientID);
		httpSession.setAttribute("diagnosisTOslist", diagnosisTOs);
		if(diagnosisTOs.isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/patientLoginSuccess.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/medicalDiagnosisList.jsp");
			dispatcher.forward(request, response);
		}

	}
}
