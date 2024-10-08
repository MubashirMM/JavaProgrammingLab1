package javaprogramming_lab2;
import java.util.Scanner;
public class Lab2_task5 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your pay rate per hour: $");
	        double payRate = scanner.nextDouble();

	        System.out.print("Enter the number of hours worked per week: ");
	        double hoursWorkedPerWeek = scanner.nextDouble();
// Constants
	 ///already given values        
int WEEKS = 5;
double TAX_RATE = 0.14;
double CLOTHES_PERCENTAGE = 0.10;

double SUPPLIES_PERCENTAGE = 0.01;
double SAVINGS_BONDS_PERCENTAGE = 0.25;
final double PARENTS_BONUS = 0.50;

	       
//calculating required values 
double incomeBeforeTaxes = payRate * hoursWorkedPerWeek * WEEKS;
double taxAmount = incomeBeforeTaxes * TAX_RATE;

double netIncome = incomeBeforeTaxes - taxAmount;
double clothesExpense = netIncome * CLOTHES_PERCENTAGE;

double suppliesExpense = netIncome * SUPPLIES_PERCENTAGE;

double remainingMoney = netIncome - (clothesExpense + suppliesExpense);
double savingsBondsExpense = remainingMoney * SAVINGS_BONDS_PERCENTAGE;
double parentsContribution = savingsBondsExpense * PARENTS_BONUS;

// Output results
System.out.printf("Income Before Taxes: $%.2f%n", incomeBeforeTaxes);
System.out.printf("Income After Taxes: $%.2f%n", netIncome);

System.out.printf("Money Spent on Clothes and Accessories: $%.2f%n", clothesExpense);

System.out.printf("Money Spent on School Supplies: $%.2f%n", suppliesExpense);
System.out.printf("Money Spent to Buy Savings Bonds: $%.2f%n", savingsBondsExpense);
System.out.printf("Money Parents Spend on Additional Savings Bonds: $%.2f%n", parentsContribution);

	    }
	}



