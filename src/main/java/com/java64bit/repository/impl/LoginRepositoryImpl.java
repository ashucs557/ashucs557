package com.java64bit.repository.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.java64bit.entity.LoginJpaRepository;
import com.java64bit.exception.HungerBaseException;
import com.java64bit.model.Login;
import com.java64bit.repository.LoginRepository;
@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	LoginJpaRepository loginJpaReposiotory;
	private Collection<Login> loginList;
	
	@Override
	public List<Login> getLoginFromDb() {
		List<Login> login=null;
		List<com.java64bit.entity.Login> loginList = loginJpaReposiotory.findAll();
		if(!CollectionUtils.isEmpty(loginList)){
		// login = mapLogin(loginList);
		}else{
			throw new HungerBaseException("login Data Not Found", HttpStatus.NOT_FOUND.value());
		}
		return login;
	}

@Override
public String createLogin(Login login) {
	// TODO Auto-generated method stub
	return null;
}

	//@Override
/*public String createRegistration(Register register) {
		com.java64bit.entity.Register state1 = new com.java64bit.entity.Register();
		state1.setCity(login.getCity());
		state1.setState(login.getlogin());
		loginJpaReposiotory.save(state1);
		
		return "Success";
	}*/

}
