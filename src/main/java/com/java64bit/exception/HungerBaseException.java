package com.java64bit.exception;

@SuppressWarnings("serial")
public class HungerBaseException extends RuntimeException{

	private String name;
	
	private int code;

	public HungerBaseException(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	
}
