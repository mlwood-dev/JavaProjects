import java.util.Scanner;

public class Bank_Program1 {
	
	public static void main(String[] args) {
		
		double money= 10.00;
		boolean run = true;
		int overdraft = 0;
		double balance;
		
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			
			System.out.println("How much would you like to withdraw?  ");
			
			double withdraw = scan.nextDouble();
			
			balance = money - withdraw;
			money = balance;
			
			if (balance < 0) {
				overdraft ++;
				
				double overdraftFee = (balance) * -.01 + (5.00 * overdraft);
				balance = -1*(balance - overdraftFee);
				System.out.println(String.format("You overdrafted your account. You owe $%.2f", balance));
				System.out.println(String.format("Your new balance is -$%.2f", balance));
				run = false;
			}
			else {
				
				System.out.println(String.format("Your new balance is $%.2f", balance));
				char answer;
				
				System.out.println("Would you like to make another transaction? (yes/no) ");
				answer = scan.next().charAt(0);
				
				
				if (answer == 'n' || answer =='N') {
					run = false;
				}
				else if (answer != 'y' && answer != 'Y') {
					
					while(answer != 'y' && answer != 'n') {
						
						System.out.println("Enter yes or no.");
						answer = scan.next().charAt(0);
						
						if (answer == 'n' || answer =='N') {
							run = false;
						}
					}
				}
			}
		}
		scan.close();
	}
}