package com.ehealth.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.CasesService;
import com.ehealth.to.AppoitmentList;

public class CasesServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside a CasesServlet");
		CasesService casesService = new CasesService();
		String todayDate = null;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		todayDate = dateFormat.format(date);
		List<AppoitmentList> appoitmentLists = casesService
				.getTodayCases(todayDate);
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("appoitmentList", appoitmentLists);
		if(appoitmentLists.isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/noCases.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/appoitmentList.jsp");
			dispatcher.forward(request, response);
		}
		
			}
		}
