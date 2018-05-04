package com.apex.assignment3_ex2;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
Exercise 2:
read two values a,b and repeat a loop from a to b and display value and their sqaure values.
output e.g: 
enter a and b value
3
5

3 9
4 16
5 25

 */
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= sc.nextInt();
		System.out.println("Enter the value of b");
		int b= sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			System.out.println(i+" "+(int)(Math.pow(i, 2)));
		}
		

	}

}
