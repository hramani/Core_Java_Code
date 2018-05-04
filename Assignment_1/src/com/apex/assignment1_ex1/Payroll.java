import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/1/2018
 *
 */
/*
 * Exercise 1:
Create a payroll program for the part-time employee. 
display no of hours he/she worked, pay rate value and pay rate per month.
Input: no of hours he/she worked and pay rate value per hour
output: display both input values and salary of the person per month
Hint: create 3 double variables hoursWorked, pay rate and use multiplication operation
 */
public class Payroll {
	
	private static int hoursWorked;
	private static int PayRate;
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers of hours");
		hoursWorked = sc.nextInt();
		System.out.println("Enter the pay rate per hour");
		PayRate = sc.nextInt();
		
		System.out.println("Total PayRoll is :"+hoursWorked*PayRate);
	}
	

}
