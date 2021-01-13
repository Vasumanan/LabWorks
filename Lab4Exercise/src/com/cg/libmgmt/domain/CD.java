package com.cg.libmgmt.domain;
public class CD extends MediaItem{
	private String dirName,genre;
	private int year;
	public String getDirName() {
		return dirName;
	}
	public String getGenre() {
		return genre;
	}
	public int getYear() {
		return year;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public CD(int idNum, int numCopies, String title, int runTime,String dirName,String genre,int year) {
		super(idNum, numCopies, title, runTime);
		this.dirName = dirName;
		this.genre = genre;
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
		return "CD id : "+getIdNum()+"\nCD Title : "+getTitle() +"\nCD director : "+getDirName()+"\nNumber Of Copies "+getNumCopies();
	}

	
}