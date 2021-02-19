package com.cg.ngo.exceptions;

public class NoSuchNeedyPersonException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchNeedyPersonException() {
		super();
	}
	public NoSuchNeedyPersonException(String msg) {
		super(msg);
	}

}
