

//name: Michael Wood
//date: 08.13.2020
//desc: Design the logic for a program that allows the user to enter a number. 
//		Display the sum of every number from 1 through the entered number.

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int counter = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to start: ");
		num = scan.nextInt();
		
		while (counter <= num) {
			sum = num + counter;
			
			System.out.printf("\nThe sum of %d and %d is %d", num, counter, sum);
			counter++;
		}
		
		scan.close();
	}
}
