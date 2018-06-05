package com.ehealth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.service.PharamacyRegistrationService;
import com.ehealth.to.PharamacyDetailsTO;

public class PharamacyRegistrationServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PharamacyDetailsTO pharamacyDetailsTO = new PharamacyDetailsTO();
		PharamacyRegistrationService pharamacyRegistrationService = new PharamacyRegistrationService();
		pharamacyDetailsTO.setPassword(request.getParameter("password"));
		pharamacyDetailsTO.setPharamacyName(request.getParameter("pharamacy_name"));
		pharamacyDetailsTO.setPharamacyRegNumber(request.getParameter("pharamacy_reg_num"));
		String phone=request.getParameter("phone_number");
		pharamacyDetailsTO.setPhoneNumber(phone);
		pharamacyDetailsTO.setAddress(request.getParameter("address"));
		pharamacyDetailsTO.setEmail(request.getParameter("email"));
		PharamacyDetailsTO pharamacyDetailsTO2=	pharamacyRegistrationService.save(pharamacyDetailsTO);
		if(pharamacyDetailsTO2.getPharamacyID() != null){
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("./PharamacyLogin.html");
		dispatcher.forward(request, response);
		}else{

			RequestDispatcher dispatcher = request
					.getRequestDispatcher("./index.html");
			dispatcher.forward(request, response);
				
		}
	}
}
