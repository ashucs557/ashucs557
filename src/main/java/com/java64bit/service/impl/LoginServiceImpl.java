package com.java64bit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java64bit.model.Login;
import com.java64bit.repository.LoginRepository;
import com.java64bit.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    
	@Autowired
	LoginRepository stateRepository;
	
	@Override
	public List<Login> getLoginFromDb() {
		
		return stateRepository.getLoginFromDb();
	}

	@Override
	public String createLogin(Login login) {
		
		return stateRepository.createLogin(login);
	}

}
