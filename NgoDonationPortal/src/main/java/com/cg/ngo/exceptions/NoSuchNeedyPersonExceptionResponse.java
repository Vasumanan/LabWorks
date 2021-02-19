package com.cg.ngo.exceptions;

public class NoSuchNeedyPersonExceptionResponse {
	
	private String userName;
    public NoSuchNeedyPersonExceptionResponse(String userName) 
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
