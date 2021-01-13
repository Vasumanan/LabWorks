package com.cg.libmgmt.domain;
public abstract class Item {
	private int idNum,numCopies;
	private String title;
	public abstract void checkIn();
	public abstract void checkOut();
	public Item(int idNum, int numCopies, String title) {
		super();
		this.idNum = idNum;
		this.numCopies = numCopies;
		this.title = title;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}