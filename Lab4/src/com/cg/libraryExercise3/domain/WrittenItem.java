package com.cg.libraryExercise3.domain;

public abstract class WrittenItem extends Item{
	private String authorName;
	public WrittenItem(int idNum, int numCopies, String title,String authorName) {
		super(idNum, numCopies, title);
		this.authorName = authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
