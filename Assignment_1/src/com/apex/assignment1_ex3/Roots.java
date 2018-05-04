package com.apex.assignment1_ex3;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
 * Exercise 3:
Find roots for the following quadratic equation.
The quadratic equation is a*X^2 + b*X + c
give different values to a,b and c. Find roots by using formula. (-b +/- sqrt(b^2 - 4*a*c) / 2*a)
If roots are imaginary then display no roots.
 */
public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of a");
		a= sc.nextInt();
		System.out.println("Enter the value of b");
		b= sc.nextInt();
		System.out.println("Enter the value of c");
		c= sc.nextInt();
		double D = (Math.pow(b,2)-(4*a*c));
		if(D<0)
		{
			System.out.println("No roots");
		}
		else if(D==0)
		{
			System.out.println("The roots is"+ (-b/2*a));
		}
		else
		{
			System.out.println("The root 1 is"+ ((-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a)));
			System.out.println("The root 2 is"+ ((-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a)));
		}
	
		
		
		

	}

}
