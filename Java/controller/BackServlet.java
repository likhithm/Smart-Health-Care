package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/backDoctorLoginSuccess.jsp");
		dispatcher.forward(request, response);
	
	}
}
