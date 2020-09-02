//name: Michael Wood
//date: 13.08.2020
//desc: The application accepts a client’s loan amount and monthly payment amount. 
//		Output the customer’s loan balance each month until the loan is paid off.

import java.util.Scanner;

public class Payment_Calc {

	public static double principal(double balance) {

		double principal = 0.00;
		
		principal = balance / 12;
		
		return principal;
}
	
	public static double interest(double currentBal) {

		double dailyInterest = 0.00;
		double interestRate = 0.1599;
		double monthlyInterest = 0.00;  
		
		dailyInterest = (interestRate/365)* currentBal;
		monthlyInterest = dailyInterest * 30;
		
		return monthlyInterest;
	}
	
	public static void main(String[] args) {
		
		double balance = 0.00;
		double monthlyBal = 0.00;
		double minPay = 0.00;
		double principal = 0.00;
		double interest = 0.00;
		int month = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your current balance:  ");
		balance = scan.nextDouble();
		
		principal = principal(balance);
		monthlyBal = balance;
		
		while (monthlyBal >= minPay) {
			
			interest = interest(monthlyBal);
			minPay = principal + interest;
			monthlyBal -= minPay;
		
			System.out.printf("\n\nMinimum Principal Payment:  $%.2f", principal);
			System.out.printf("\nYour monthly interest is:  $%.2f", interest);
			System.out.printf("\nYour minimum payment for month %d is $%.2f", month, minPay);
			System.out.printf("\nNew Balance after payment will be $%.2f", monthlyBal);
			month++;
				
		}
		scan.close();
	}
}
