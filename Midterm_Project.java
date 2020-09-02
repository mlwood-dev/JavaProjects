import java.util.Scanner;

//name: Michael Wood
//date: 2020 Aug 11
//desc: Instructions
//
//	The Boffo Balloon Company makes helium balloons.  Large balloons cost $13.00 a dozen, medium-sized balloons cost $11.00 a dozen, 
//	and small balloons cost $8.60 a dozen.  Customer order information includes customer name, quantity ordered, and size.  This program 
//	should output the customer order information as well as total sales according to what and how many balloons they have ordered.


public class Midterm_Project {

	static double large = 13.00;
	static double medium = 11.00;
	static double small = 8.60;
	
	
	public static void main(String[] args) {
		String cusName = "";
		int cusQuantityL = 0;
		int cusQuantityM = 0; 
		int cusQuantityS = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter customer name: ");
		cusName = scan.nextLine();
		
		
		System.out.println("Please enter Quantity Large: ");
		cusQuantityL = scan.nextInt();
		
		System.out.println("Please enter Quantity Medium: ");
		cusQuantityM = scan.nextInt();
		
		System.out.println("Please enter Quantity Small: ");
		cusQuantityS = scan.nextInt();
		
		System.out.println("\n\n----------------Order info:---------------");
		System.out.println("Customer Name => " + cusName);
		
		getTotal(cusQuantityL, cusQuantityM, cusQuantityS);
		
		
		scan.close();
	}
	
	public static void getTotal(int cusQuantityL, int cusQuantityM, int cusQuantityS) {
		double cusTotal;
		
		cusTotal = (cusQuantityL*large) + (cusQuantityM*medium) + (cusQuantityS*small);
		System.out.printf("\n\tSmall Balloons Ordered: " + cusQuantityS + "x $%2.2f", small );
		System.out.printf("\n\tMedium Balloons Ordered: " + cusQuantityM + "x $%2.2f", medium );
		System.out.printf("\n\tLarge Balloons Ordered: " + cusQuantityL + "x $%2.2f", large );
		System.out.printf("\n\tCustomer Total => $%2.2f",cusTotal);
		return;
		
		
	}
}
