package com.ehealth.service;

import com.ehealth.dao.LoginCheckDAO;
import com.ehealth.to.LoginDetailsTO;

public class LoginCheckService {

	public boolean checkLogin(LoginDetailsTO loginDetailsTO) {
		LoginCheckDAO checkDAO = new LoginCheckDAO();
	return	checkDAO.checkLogin(loginDetailsTO);
		
	}

}
