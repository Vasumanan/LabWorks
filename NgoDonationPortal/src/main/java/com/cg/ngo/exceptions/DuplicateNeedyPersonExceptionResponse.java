package com.cg.ngo.exceptions;

public class DuplicateNeedyPersonExceptionResponse {
	
	private String userName;
    public DuplicateNeedyPersonExceptionResponse(String userName) 
	{
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}
}
