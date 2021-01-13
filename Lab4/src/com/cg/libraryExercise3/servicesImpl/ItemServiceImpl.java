package com.cg.libraryExercise3.servicesImpl;
import com.cg.libraryExercise3.DAO.*;
import com.cg.libraryExercise3.DAOImpl.ItemDAOImpl;
import com.cg.libraryExercise3.domain.*;
import com.cg.libraryExercise3.exception.InvalidIdNumException;
import com.cg.libraryExercise3.services.*;

import java.util.*;
public class ItemServiceImpl implements ItemService{
	Scanner sc = new Scanner(System.in);
	ItemDAO itemDAO;
	public ItemServiceImpl() {
		itemDAO = new ItemDAOImpl();
	}

	@Override
	public void addItem(int idNum, String title, int numCopies,int firstOption,int secondOption) {
		if(ItemService.ITEM_TYPE_WRITTEN==firstOption) {
			Item item ; 
			if(ItemService.WRITTEN_TYPE_BOOK==secondOption) {
				String authorName="";
				System.out.println("Enter the author name: ");
				authorName = sc.next();
				item = new Book(idNum,numCopies,title,authorName);
				itemDAO.saveItem(item);
			}
			else if(ItemService.WRITTEN_TYPE_JOURNAL==secondOption) {
				String authorName="";
				int year;
				System.out.println("Enter the author name: ");
				authorName = sc.next();
				System.out.println("Enter the year: ");
				year = sc.nextInt();
				item = new JournalPaper(idNum,numCopies,title,authorName,year);
				itemDAO.saveItem(item);
			}
		}
		else if(ItemService.ITEM_TYPE_MEDIA==firstOption) {
			Item item;
			if(ItemService.MEDIA_TYPE_CD==secondOption) {
				int runTime,year;
				String dirName,genre;
				System.out.println("Enter the director name: ");
				dirName = sc.next();
				System.out.println("Enter the year: ");
				year = sc.nextInt();
				System.out.println("Enter the Run time: ");
				runTime = sc.nextInt();
				System.out.println("Enter the Genre : ");
				genre = sc.next();
				item = new CD(idNum,numCopies,title,runTime,dirName,genre,year);
				itemDAO.saveItem(item);
			}
			else if(ItemService.MEDIA_TYPE_VIDEO==secondOption) {
				int runTime,year;
				String artist,genre;
				System.out.println("Enter the artist name: ");
				artist = sc.next();
				System.out.println("Enter the year: ");
				year = sc.nextInt();
				System.out.println("Enter the Run time: ");
				runTime = sc.nextInt();
				System.out.println("Enter the Genre : ");
				genre = sc.next();
				item = new Video(idNum,numCopies,title,runTime,artist,genre);
				itemDAO.saveItem(item);
			}  
		}
	}

	@Override
	public void checkIn(int idNum) throws InvalidIdNumException{
		Boolean validId = false;
		for(Item item : itemDAO.getList()) {
			if(item.getIdNum()==idNum) {
				item.checkIn();
                validId =true;				
			}
		}
		if(validId == false) {
			throw new  InvalidIdNumException("Sorry! The Identity number entered is not Valid");
		}
	}
		
	@Override
	public void checkOut(int idNum) throws InvalidIdNumException{
		Boolean validId = false;
		for(Item item : itemDAO.getList()) {
			if(item.getIdNum()==idNum) {
				item.checkOut();
				validId= true;
			}
		}
		if(validId == false) {
			throw new  InvalidIdNumException("Sorry! The Identity number entered is not Valid");
		}
		
	}

	@Override
	public List<Item> getList() {
		return itemDAO.getList();
	}

}
