/*
name: Michael Wood
date: 08.18.2020
desc: John Smith, a manager of car dealership, wants to acknowledge high achieving salespeople.  
	Create a program that accepts the salesperson's name and displays their name and bonus amount based 
	on the following:
	
	If the number or cars sold is less than 5, the bonus is $50
	If the number of cars sold is between 6 and 10, the bonus is $100
	If the number of cars sold is higher than 10, the bonus is $500
*/	

import java.util.Scanner;

public class Assignment {
	
	public static void main(String[] args) {
		
		int carSold = 0;
		int decision = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		while (carSold != -1) {
			System.out.println("How many cars did you sell (Enter -1 to quit)?  ");
			carSold = scan.nextInt();
			
			if(carSold < 5 && carSold > 0){
				decision = 1;
				}else if (carSold > 5 && carSold < 10) {
					decision=2;
					}else if (carSold > 10) {
						decision = 3;
						}
			
			switch(decision) {
				case 1: 
					System.out.printf("You sold %d cars\n",carSold);
					System.out.println("Your bonus is $50\n");
					break;
				case 2:
					System.out.printf("You sold %d cars\n", carSold);
					System.out.println("Your bonus is $100\n");
					break;
				case 3:
					System.out.printf("You sold %d cars\n", carSold);
					System.out.println("Your bonus is $500\n");
					break;
			default:
				break;
			}
		}
		scan.close();
	}
	
}
