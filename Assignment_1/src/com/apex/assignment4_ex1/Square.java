package com.apex.assignment4_ex1;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*

Exercise 3:
create another program same as exercise 1 for sum of square of first n numbers
Note: do two ways 1^2+2^2+3^2+4^2....n or n(n+1)(2n+1)/6
 */
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int total=0;
		for(int i=1;i<=a;i++)
		{
			total= (int) (Math.pow(i,2)+total);
		}
		System.out.println("total sum  is"+total);
		
		

	}

}
