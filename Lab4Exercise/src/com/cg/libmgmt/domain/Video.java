package com.cg.libmgmt.domain;
public class Video extends MediaItem{
	private String artist,genre;
	public Video(int idNum, int numCopies, String title, int runTime,String artist,String genre) {
		super(idNum, numCopies, title, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setGenre(String genre) {
		this.genre = genre;
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
		return "Video id : "+getIdNum()+"\nVideo Title : "+getTitle() +"\nVideo Artist : "+getArtist()+"\nNumber Of Copies "+getNumCopies();
	}
	
	

}
