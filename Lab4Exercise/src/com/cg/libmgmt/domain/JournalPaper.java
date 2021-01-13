package com.cg.libmgmt.domain;
public class JournalPaper extends WrittenItem {
	private int year;
	public JournalPaper(int idNum, int numCopies, String title, String authorName,int year) {
		super(idNum, numCopies, title, authorName);
		this.year = year;
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
		return "Journal id : "+getIdNum()+"\nJournal Title : "+getTitle() +"\nJournal Author : "+getAuthorName()+"\nNumber Of Copies "+getNumCopies();
	}
}
