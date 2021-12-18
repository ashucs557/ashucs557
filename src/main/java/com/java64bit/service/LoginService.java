package com.java64bit.service;

import java.util.List;

import com.java64bit.model.Login;

public interface LoginService {

	List<Login> getLoginFromDb();

	String createLogin(Login login);

}
