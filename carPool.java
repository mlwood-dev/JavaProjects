/*
name: Michael Wood
date: 08.20.2020
desc: Black Dot Printing is attempting to organize carpools to save energy. Each input record 
	contains an employee’s name and town of residence. Ten percent of the company’s employees live 
	in Wonder Lake; 30 percent live in the adjacent town of Woodstock. Black Dot wants to encourage
	employees who live in either town to drive to work together. Design a flowchart that accepts an 
	employee’s data and displays it with a message that indicates whether the employee is a candidate 
	for the carpool (because he lives in one of the two cities).
*/

import java.util.Scanner;

public class carPool {

	
	
	public static void main(String[] args) {
		String name,
			   town,
			   x = "woodstock",
			   y = "wonder lake";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Enter your town: ");
		town = scan.nextLine();
		town = town.toLowerCase();
		
		if ((town.contentEquals(x)) || (town.contentEquals(y))) {
			System.out.printf("%s, you can carpool!", name);
		} else {
			System.out.printf("Sorry %s, you can't carpool!", name);
		}
		
		scan.close();
	}	
}
