/**
*  Write a java program that simulates a traffic light. 
*  The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
*  On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
*  Initially there is no message shown.
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise2 {
	static String trafficLightColor;
	public static void getChoice(Scanner sc) {
		System.out.println("Enter the traffic Light color");
		trafficLightColor = sc.next();
	}
	public static String printMessage(String color) {
		String message;
		switch(color) {
			case "red":{
				message="stop";
				break;
			}
			case "yellow":{
				message="steady";
				break;
			}
			case "green":{
				message="go";
				break;
			}
			default:{
				message="Invalid color";
				break;
			}
		}
		return message;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getChoice(sc);
		System.out.println(printMessage(trafficLightColor));
	}


}
