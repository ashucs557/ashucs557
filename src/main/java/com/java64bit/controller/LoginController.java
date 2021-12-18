package com.java64bit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java64bit.exception.HungerBaseException;
import com.java64bit.model.Login;
import com.java64bit.service.LoginService;

@RestController

public class LoginController {
	

	/*
	 * @RequestMapping("/") public String welcome() { System.out.println("s");
	 * return"welcome"; }
	 */
    
    
	@Autowired
	LoginService loginService;

    @RequestMapping(value="/login",method=RequestMethod.GET )
    public ResponseEntity<List<Login>> getLogin() {
    	List<Login> list = new ArrayList<>();
       try{
    	  list = loginService.getLoginFromDb();
       }catch(HungerBaseException ex){
    	   throw new HungerBaseException(ex.getMessage(), ex.getCode());
       }
    	return new ResponseEntity<>(list,HttpStatus.OK);
    }
  
}
