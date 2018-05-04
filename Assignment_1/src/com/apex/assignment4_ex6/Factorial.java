package com.apex.assignment4_ex6;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/3/2018
 */

/*
 * Exercise 6:
   create a write a program to display factorial of a number
   Hint : read a number(n) and use this formula for factorial 1*2*3*....n
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		BigInteger result= new BigInteger("1");
	
		for(int i=1;i<=n;i++)
		{
			  
			result= result.multiply(new BigInteger(i+""));
		}
		System.out.println("Factorial of number is "+result);
		
	}

}
