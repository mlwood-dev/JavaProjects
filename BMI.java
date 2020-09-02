import java.util.Scanner;

public class BMI {
	
	public static void imperialBMI() {
		
		double constant = 703,
				denominator,
				height,
				weight;
		
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Height : ");
		height = scan.nextDouble();
		
		System.out.println("Input Weight : ");
		weight = scan.nextDouble();
		
		//process
		denominator = Math.pow(height, 2);
		double bmi = constant * weight/denominator;
		
		//output
		System.out.println("The bmi is :  ");
		System.out.println(String.format("%.2f", bmi));
		System.out.println(bmi);
		
		//close scanner
		scan.close();
	}
	
	public static void metricBMI() {
		
		double 	denominator,
				height,
				weight;
		
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Height : ");
		height = scan.nextDouble();
		
		System.out.println("Input Weight : ");
		weight = scan.nextDouble();
		
		//process
		denominator = Math.pow(height, 2);
		double bmi = weight/denominator;
		
		//output
		System.out.println("The bmi is :  ");
		System.out.println(String.format("%.2f", bmi));
		System.out.println(bmi);
		
		//close scanner
		scan.close();
	}


	public static void main(String[] args) {
		int choose;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Select 1 for imperialBMI Calculation");
		System.out.println("Select 2 for metricBMI Calculation");
		choose = scan.nextInt();
		
		if (choose == 1) {
			imperialBMI();
		}
		if (choose == 2) {
			metricBMI();
		}
		scan.close();
	}

}
