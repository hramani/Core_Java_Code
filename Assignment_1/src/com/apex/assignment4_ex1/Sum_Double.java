package com.apex.assignment4_ex1;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
Exercise 2:
create same problem as exercise 1 for double values

 */
public class Sum_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a=0;
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("Enter the number");
			a= sc.nextDouble()+a;
			System.out.println("total sum  is"+a);
			
		}
		
		

	}

}
