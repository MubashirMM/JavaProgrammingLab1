package javaprogramming_lab2;
import java.util.Scanner;

public class Lab2_task4 {
	
	    public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        
	  // calcualting all values 
System.out.print("Enter the original price of the item: $");
double originalPrice = scanner.nextDouble();	        
System.out.print("Enter the percentage markup: ");

double markupPercentage = scanner.nextDouble();	        	       
System.out.print("Enter the sales tax rate (in percentage): ");
double salesTaxRate = scanner.nextDouble();
double markupAmount = originalPrice * (markupPercentage / 100);

double sellingPrice = originalPrice + markupAmount;
double salesTax = sellingPrice * (salesTaxRate / 100);
 double finalPrice = sellingPrice + salesTax;

// Output the results12        
System.out.printf("Original Price: $%.2f%n", originalPrice);
System.out.printf("Marked-up Percentage: %.2f%%%n", markupPercentage);
System.out.printf("Selling Price: $%.2f%n", sellingPrice);

System.out.printf("Sales Tax Rate: %.2f%%%n", salesTaxRate);
System.out.printf("Sales Tax: $%.2f%n", salesTax);
System.out.printf("Final Price: $%.2f%n", finalPrice);
	    }
	
}
