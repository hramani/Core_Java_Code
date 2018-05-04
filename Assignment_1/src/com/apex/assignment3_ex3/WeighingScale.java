package com.apex.assignment3_ex3;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
Us government ask our team to develop an application for traditional weighing machine. can you please develop an application.
Hint : create a loop statement in which it should ask left side and right side weights, whenever both sides are equal then it should come out of loop.

 */
public class WeighingScale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("Enter the value of a");
			a= sc.nextInt()+a;
			System.out.println("Enter the value of b");
			b= sc.nextInt()+b;
			if(a==b)
				break;
			System.out.println("Not the same value");
		}
		System.out.println("the same value");
		

	}

}
