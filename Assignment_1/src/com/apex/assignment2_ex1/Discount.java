package com.apex.assignment2_ex1;

import java.util.Scanner;

/**
 * 
 * @author hiral
 *
 */
/*
 * Program 1:
Write a program which calculate the Discount(5%) price for an Item.
Note: take the item price from user and find 5% discount
Hint: Use Scanner class and nextDouble() method
 */

public class Discount {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		double after_discount=price-((price*5)/100);
		System.out.println("Price after discount "+ after_discount);
	}

}
