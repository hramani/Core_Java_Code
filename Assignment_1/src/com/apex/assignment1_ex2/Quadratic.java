package com.apex.assignment1_ex2;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
 * Exercise 2:
Find result for the following quadratic equation
a quadratic equation is 3*X^2 - 8*X + 4
give different values to X and run the program and display the result
Input: integer value for x
Output: result after substituting the x value.
e.g: 
input: 1
output: -1 
explanation: 3*1*1 - 8*1 + 4 = -1



 */
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("3*X^2 - 8*X + 4");
		System.out.println("Enter the value of X");
		int x = sc.nextInt();
		int result = (int) (3*(Math.pow(x,2)) - (8*x) + 4);
		System.out.println("result is :"+ result);
		

	}

}
