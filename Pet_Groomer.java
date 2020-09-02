/*
  name: Michael Wood
  date: 08.18.2020
  desc: Pet Care is a doggy day care that would like you to create a program that accepts 
	the dog owner's name pet's name, breed, age and weight of the dog.  The program should 
	allow the user to enter this data until a sentinel value is reached.  Then it will display 
	the dog's name if the dog weighs less than 20 pounds or more than 100 pounds (be sure to use 
	a logical operator here). 
*/

import java.util.Scanner;



public class Assignment {
	
	public static void start() {
		String ownerName = null,
				petName = null,
				breed;
		double petAge, petWeight = 0;
		int sentinel = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(sentinel != -1){

			System.out.println("Please enter the owner's name: \n");
			ownerName = scan.next();
			
			System.out.println("Please enter the pet's name: \n");
			petName= scan.next();
			
			System.out.println("Please enter the pet's breed: \n");
			breed = scan.next();
			
			System.out.println("Please enter the pet's age: \n");
			petAge = scan.nextDouble();
			
			System.out.println("Please enter the pet's weight: \n");
			petWeight = scan.nextDouble();
				
			System.out.println("To start program enter1; to continue or -1 to quit");
			sentinel = scan.nextInt();
			
		}
		if (petWeight <= 20 || petWeight >= 100) {
			System.out.printf("\tOwner name: %s\n",ownerName);
			System.out.printf("\tPet name: %s\n",petName);
			System.out.printf("\tPet weight: %.2flbs\n",petWeight);
		}
		
		scan.close();
	}


	public static void main(String[] args) {
		
			start();
	}
}