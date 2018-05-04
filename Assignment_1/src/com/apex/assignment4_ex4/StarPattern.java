package com.apex.assignment4_ex4;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/3/2018
 *
 */
/*
 * Exercise 4:
use loops take number lines and display starts
display the output like
*******
******
*****
****
***
**
*
 */
public class StarPattern {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
