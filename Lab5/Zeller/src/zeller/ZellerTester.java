package zeller;

import java.util.Scanner;

public class ZellerTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter year (e.g., 2012): ");
        int year = Integer.parseInt(scan.nextLine());
        
        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(scan.nextLine());
        
        System.out.print("Enter day of the month (1-31): ");
        int days = Integer.parseInt(scan.nextLine());
        
        Zeller calculator = new Zeller(days, month, year);
        
        System.out.println("Day of the week is " + calculator.getDayOfWeek());
	}
}
