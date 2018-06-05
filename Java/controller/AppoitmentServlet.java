package com.ehealth.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.AppoitmentService;
import com.ehealth.to.AppoitmentList;

public class AppoitmentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
System.out.println("inside a Appoitment");
String startDateText = request.getParameter("startDate");
String endDatetext = request.getParameter("endDate");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try {
	Date startDate = sdf.parse(startDateText);
	Date endDate = sdf.parse(endDatetext);
	
	AppoitmentService appoitmentService= new  AppoitmentService();
List<AppoitmentList>appoitmentLists = 	appoitmentService.getAppoitmentList(startDate, endDate);
HttpSession httpSession=request.getSession();
httpSession.setAttribute("appoitmentList", appoitmentLists);
if(appoitmentLists.isEmpty()){
	RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/noCases.jsp");
	dispatcher.forward(request, response);
}else{
	RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/appoitmentList.jsp");
	dispatcher.forward(request, response);
}
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
