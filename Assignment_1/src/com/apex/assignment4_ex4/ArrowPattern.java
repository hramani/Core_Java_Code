package com.apex.assignment4_ex4;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/3/2018
 *
 */
/*
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
      ***
      ***
      ***

 */
public class ArrowPattern {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1;i<=(n+1)/2;i++)
		{
			for(int j=i;j<=(n+1)/2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=3;j++)
			{
				System.out.print("^");
			}
		
			System.out.println();
		}
		
	}

}
