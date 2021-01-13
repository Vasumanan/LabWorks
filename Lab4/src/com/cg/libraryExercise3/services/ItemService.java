package com.cg.libraryExercise3.services;
import com.cg.libraryExercise3.domain.*;
import com.cg.libraryExercise3.exception.*;

import java.util.*;
/**
 * This ItemServices Interface will perform all the Item(BOOK,JOURNAL,CD,VIDEO) 
 * Related Opearations.
 * 
 * @author Vasumanan J
 *
 */
public interface ItemService {
	int ITEM_TYPE_WRITTEN = 1;
	int ITEM_TYPE_MEDIA = 2;
	int WRITTEN_TYPE_BOOK = 1;
	int WRITTEN_TYPE_JOURNAL= 2;
	int MEDIA_TYPE_CD=1;
	int MEDIA_TYPE_VIDEO=2;
	
	/**
	 * This adddItem method will addItem to Local Repository based on below informations
	 * @param idNum is the Identity number of the item(BOOK,JOURNAL,CD,VIDEO)
	 * @param title is the Title of the Item(BOOK,JOURNAL,CD,VIDEO) 
	 * @param numCopies is the Number of copies Available of the item(BOOK,JOURNAL,CD,VIDEO) 
	 * @param firstOpt is to choose the Item(1.Written 2.Media)
	 * @param secondOpt is to choose further classification available
	 * Written(1.Book 2.Journal)  Media(1.CD 2.Video)
	 */
	public void addItem(int idNum, String title, int numCopies,int firstopt,int secondOpt);
	
	/**
	 * This checkIn method will checkIn the item(BOOK,JOURNAL,CD,VIDEO) to Local Repository based on below informations
	 * @param idNum is the Identity number of the item(BOOK,JOURNAL,CD,VIDEO)
	 * @throws InvalidIdNumException will be thrown in case identity number is wrong.
	 */
	public void checkIn(int idNum)throws InvalidIdNumException;
	
	/**
	 * This checkIn method will checkOut the item(BOOK,JOURNAL,CD,VIDEO) to Local Repository based on below informations
	 * @param idNum is the Identity number of the item(BOOK,JOURNAL,CD,VIDEO)
	 * @throws InvalidIdNumException will be thrown in case identity number is wrong.
	 */
	public void checkOut(int idNum)throws InvalidIdNumException;;
	/**
	 * This method will return the Item List stored in the Local Repository
	 */
	public List<Item> getList();

}
