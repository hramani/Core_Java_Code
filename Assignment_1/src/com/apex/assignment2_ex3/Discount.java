package com.apex.assignment2_ex3;

import java.util.Scanner;

/**
 * 
 * @author hiral
 *
 */
/*
Program 3:
Write a program which calculate the Discount(5%) price for a collection of items, where the discount applies to purchases of total over $10.00. 
cost details:
    5 cents per a cookie
    3 cents per a cake
Note: take no.of cookies and no.of cakes from user and find 5% discount
Hit: use if statement and multiplication operation
*/
public class Discount {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of cookie");
		int cookie = sc.nextInt();
		System.out.println("Enter the number of cake");
		int cake = sc.nextInt();
		
		double price = (cookie*0.5)+(cake*0.3);
		System.out.println("Price before discount "+ price);
		if(price>10)
		{
			price=price-((price*5)/100);
		}
		System.out.println("Price after discount "+ price);
	}

}
