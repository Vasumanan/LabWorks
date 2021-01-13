package com.cg.libraryExercise3.main;
import com.cg.libraryExercise3.Util.MenuUtil;
/**
* Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
* Have an abstract superclass called Item.
* Include common information that the library must have for every item (such as unique identification number, title, and number of copies).
* No actual objects of type Item will be created - each actual item will be an object of a (non-abstract) subclass. 
* Place item-type-specific behavior in subclasses (such as a video's year of release, a CD's musical genre, or a book's author).
*
* @author Vasumanan J
*
*/
public class LibraryManagement {

	public static void main(String[] args) {
		MenuUtil menuUtil = new MenuUtil();
		menuUtil.start();

	}

}
