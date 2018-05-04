package com.apex.assignment4_ex1;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
create a while loop to display sum of integers
output e.g: 
Enter an integer
3
sum = 3
Enter an integer
4
sum = 7
Enter an integer
4
 */
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("Enter the number");
			a= sc.nextInt()+a;
			System.out.println("total sum  is"+a);
			
		}
		
		

	}

}
