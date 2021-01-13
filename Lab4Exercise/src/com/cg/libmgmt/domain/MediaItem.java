package com.cg.libmgmt.domain;
public abstract class MediaItem extends Item {
	private int runTime;
	public MediaItem(int idNum, int numCopies, String title,int runTime) {
		super(idNum, numCopies, title);
		this.runTime = runTime;
	}

	
}
