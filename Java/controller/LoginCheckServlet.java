package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.LoginCheckService;
import com.ehealth.to.LoginDetailsTO;

public class LoginCheckServlet extends HttpServlet {
	LoginDetailsTO loginDetailsTO = new LoginDetailsTO();

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LoginCheckService checkService = new LoginCheckService();
		loginDetailsTO.setLoginId(request.getParameter("id"));
		loginDetailsTO.setPassword(request.getParameter("password"));
		loginDetailsTO.setType(request.getParameter("loginType"));
		boolean validate = checkService.checkLogin(loginDetailsTO);
		if (validate) {
			if (loginDetailsTO.getType().equalsIgnoreCase("patient")) {
				HttpSession session = request.getSession();
				session.setAttribute("patientID", loginDetailsTO.getLoginId());
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("./jsp/patientLoginSuccess.jsp");
				dispatcher.forward(request, response);
			} else if (loginDetailsTO.getType().equalsIgnoreCase("doctor")) {

				HttpSession session = request.getSession();
				session.setAttribute("doctorID", loginDetailsTO.getLoginId());
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("./jsp/doctorLoginSuccess.jsp");
				dispatcher.forward(request, response);

			} else if (loginDetailsTO.getType().equalsIgnoreCase("pharmacy")) {

				HttpSession session = request.getSession();
				session.setAttribute("doctorID", loginDetailsTO.getLoginId());
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("./jsp/pharmacyLoginSuccess.jsp");
				dispatcher.forward(request, response);

			} 
			
		}
		else { 
			   RequestDispatcher dispatcher = request
					    .getRequestDispatcher("./invalidlogin.html");
			dispatcher.forward(request, response);
			
		}
	}
}
