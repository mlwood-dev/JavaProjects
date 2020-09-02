//name: Michael Wood
//date: 08/06/2020
//desc: This is the logic for a program needed by Hometown Bank. The program determines a monthly checking account fee.
//	Input includes an account balance and the number of times the account was overdrawn. The output is the fee, which is 1 percent
//	of the balance minus 5 dollars for each time the account was overdrawn. Use three modules. The main program declares global
//	variables and calls housekeeping, detail, and end-of-job modules. The housekeeping module prompts for and accepts balances. 
//	The detail module prompts for and accepts the number of overdrafts, computes the fee, and displays the result. The end-of-job 
//	module displays the message Thanks for using this program.

import java.util.Scanner;

public class bank {

	public static void housekeeping() {
		System.out.println("Welcome to our bank.");
	}

	public static void endOfJob() {
		System.out.println("Thanks for visiting the bank.");
	}

	public static void main(String[] args) {
		double balance, numOverdrafts, fee;

		housekeeping();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the balance:  ");
		balance = scan.nextDouble();

		System.out.println("Enter number of overdrafts:  ");
		numOverdrafts = scan.nextDouble();

		fee = (0.01 * balance) - (5 * numOverdrafts);

		System.out.println("The fee is: ");
		System.out.println(String.format("%.2f", fee));

		endOfJob();

		scan.close();

	}

}