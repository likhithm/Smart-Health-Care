package com.ehealth.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ehealth.service.PharmacyDetailsServices;
import com.ehealth.to.PharamacyDetailsVO;

public class PharmacyDetailsServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	String type = request.getParameter("type");
	PharmacyDetailsServices detailsServices= new PharmacyDetailsServices();
	if(type.equalsIgnoreCase("ToDay")){
		String todayDate = null;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		todayDate = dateFormat.format(date);
		List<PharamacyDetailsVO> detailsVOs=detailsServices.getDetails(todayDate);
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("pharamacyDetailsvo", detailsVOs);
		httpSession.setAttribute("heading", "TODAY'S LIST");
		if(detailsVOs.isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyLoginSuccessdisplay.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyDetailsDisplay.jsp");
			dispatcher.forward(request, response);
		}

	}else if(type.equalsIgnoreCase("week")){
		String startDateText = request.getParameter("startDate");
		String endDatetext = request.getParameter("endDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date startDate = sdf.parse(startDateText);
			Date endDate = sdf.parse(endDatetext);
			List<PharamacyDetailsVO> detailsVOs =	detailsServices.getDetailsByWeek(startDate,endDate);
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("pharamacyDetailsvo", detailsVOs);
			httpSession.setAttribute("heading", "WEEKS LIST");
			if(detailsVOs.isEmpty()){
				RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyLoginSuccessdisplay.jsp");
				dispatcher.forward(request, response);
			}else{
				RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyDetailsDisplay.jsp");
				dispatcher.forward(request, response);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}else if(type.equalsIgnoreCase("all")){
		List<PharamacyDetailsVO> detailsVOs =	detailsServices.getDetailsAll();
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("pharamacyDetailsvo", detailsVOs);
		httpSession.setAttribute("heading", "COMPLETE LIST");
		if(detailsVOs.isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyLoginSuccessdisplay.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyDetailsDisplay.jsp");
			dispatcher.forward(request, response);
		}
	}else if(type.equalsIgnoreCase("search")){

		String startDateText = request.getParameter("startDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date startDate = sdf.parse(startDateText);
			List<PharamacyDetailsVO> detailsVOs =	detailsServices.getDetailsByWeek(startDate);
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("pharamacyDetailsvo", detailsVOs);
			httpSession.setAttribute("heading", " LIST OF  A PARTICULAR DAY");
			if(detailsVOs.isEmpty()){
				RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyLoginSuccessdisplay.jsp");
				dispatcher.forward(request, response);
			}else{
				RequestDispatcher dispatcher= request.getRequestDispatcher("./jsp/pharmacyDetailsDisplay.jsp");
				dispatcher.forward(request, response);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
}
