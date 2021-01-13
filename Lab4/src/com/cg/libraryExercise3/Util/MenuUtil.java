package com.cg.libraryExercise3.Util;
import java.util.*;

import com.cg.libraryExercise3.domain.*;
import com.cg.libraryExercise3.exception.InvalidIdNumException;
import com.cg.libraryExercise3.services.*;
import com.cg.libraryExercise3.servicesImpl.*;
public class MenuUtil {
	Scanner sc =new Scanner (System.in);
	private ItemService itemService;
	public MenuUtil() {
		itemService = new ItemServiceImpl();
	}
	public void start() {
		Scanner sc =new Scanner(System.in);
		String continueStatus;
		int choice;
		do {
			System.out.println("---------------LIBRARY MANAGEMENT SYSTEM-----------------");
			System.out.println("\n1.Add Details");
			System.out.println("2.Check In");
			System.out.println("3.Check Out");
			System.out.println("4.Find Details");
			System.out.println("0.Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					addDetails();
					break;
				case 2:
					checkIn();
					break;
				case 3:
					checkOut();
					break;
				case 4:
					displayDetails();
					break;
				case 0 :
					System.out.println("========================Thank You Have a Nice Day=============================");
					System.exit(0);
				default:
					System.out.println("Invalid Option");
					break;
			}
			System.out.println("Did you wish to continue(Yes|No)");
			continueStatus = sc.next();
		}while(continueStatus.equalsIgnoreCase("yes"));
		System.out.println("========================Thank You Have a Nice Day=============================");

	}

	private void displayDetails() {
		List<Item> list = new ArrayList<>();
		list = itemService.getList();
		for(Item item : list) {
			System.out.println("\n"+item);
		}
	}


	private void checkOut() {
		int idNum;
		Boolean validId = true;
		System.out.println("Enter Identity number :");
		idNum = sc.nextInt();
		try {
			itemService.checkOut(idNum);			
		}
		catch(InvalidIdNumException e) {
			System.out.println(e.getMessage());
			validId=false;
		}
		if(validId)
			System.out.println("Success!...Item Checked Out");
		
	}


	private void checkIn() {
		int idNum;
		Boolean validId =true;
		System.out.println("Enter Identity number :");
		idNum = sc.nextInt();
		try {
			itemService.checkIn(idNum);			
		}
		catch(InvalidIdNumException e) {
			System.out.println(e.getMessage());
			validId =false;
		}
		if(validId)
			System.out.println("Success!...Item Checked In");
		
	}

	private void addDetails() {
		int idNum,numCopies,firstOption=0,secondOption=0;
		String title;
		System.out.println("Select the item you wish to add (1.Written 2.Media)");
		firstOption =sc.nextInt();
		switch(firstOption) {
		case 1:
			System.out.println("Select the Written Iten you wish to add(1.Book 2.Journal)");
			secondOption = sc.nextInt();
			break;
		case 2:
			System.out.println("Select the Media Iten you wish to add(1.Video 2.CD)");
			secondOption = sc.nextInt();
			break;
		default:
			System.out.println("Invalid Option");
			System.exit(0);
		}
		System.out.println("Enter the Identity Number :");
		idNum = sc.nextInt();
		System.out.println("Enter the Number Of Copies :");
		numCopies = sc.nextInt();
		System.out.println("Enter the title :");
		title = sc.next();
		itemService.addItem(idNum,title,numCopies,firstOption,secondOption);
		System.out.println("Successfully Added!...");
		
	}

}
