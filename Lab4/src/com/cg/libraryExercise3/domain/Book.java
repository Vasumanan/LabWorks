package com.cg.libraryExercise3.domain;
public class Book extends WrittenItem{

	public Book(int idNum, int numCopies, String title, String authorName) {
		super(idNum, numCopies, title, authorName);
	}

	@Override
	public void checkIn() {
		super.setNumCopies(super.getNumCopies()+1);
		
	}

	@Override
	public void checkOut() {
		super.setNumCopies(super.getNumCopies()-1);
		
	}
	@Override
	public String toString() {
		return "Book id : "+getIdNum()+"\nBook Title : "+getTitle() +"\nBook Author : "+getAuthorName()+"\nNumber Of Copies "+getNumCopies();
	}
	
}