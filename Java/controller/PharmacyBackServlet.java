package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PharmacyBackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/backPharmacyLoginSuccess.jsp");
		dispatcher.forward(request, response);
	
	}
}
