package com.zensar.exceptions;

public class UserServiceException  extends Exception{
	
	public class getMessage extends Exception {

	}

	public String errorMessage;
	
	public UserServiceException()
	{
		errorMessage ="error: service exception";
	}

	public UserServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "UserServiceException [errorMessage=" + errorMessage + "]";
	}

}
