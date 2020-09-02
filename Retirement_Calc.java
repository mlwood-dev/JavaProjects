/*
	name: Michael Wood
	date: 25.08.2020
	desc: Design a retirement planning calculator for Skulling Financial Services. Allow a user to enter a number 
		of working years remaining in the user’s career and the annual amount of money the user can save. Assume that 
		the user earns three percent simple interest on savings annually. Program output is a schedule that lists each 
		year number in retirement starting with year 0 and the user’s savings at the start of that year. Assume that 
		the user spends $60,000 per year in retirement and then earns three percent interest on the remaining balance.
		End the list after 30 years, or when the user’s balance is 0 or less, whichever comes first.
*/

import java.util.Scanner;

public class Retirement_Calc {

	public static void start(int years, int savingsPerYear ) {
		int counter = 0;
		int expenses = 60000;
		double balance = years * savingsPerYear;
		
		while (balance > 0 && counter <= 30) {
			
			balance = balance - expenses;
			balance = (balance*0.03)+balance;
		
			System.out.printf("\nYour balance for year %d is %.2f",counter, balance);
			counter++;
		}

	}
	public static void main(String[] args) {
		int yearsLeft= 0;
		int savings= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of years remaining before retirement: ");
		yearsLeft = scan.nextInt();
		System.out.println("Enter the amount to be saved every year: ");
		savings = scan.nextInt();
		
		start(yearsLeft, savings);
		
		scan.close();
	}

}
