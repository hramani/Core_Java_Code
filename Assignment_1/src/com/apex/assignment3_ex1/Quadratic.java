package com.apex.assignment3_ex1;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
create a loop to display first 10 numbers with their square values
output e.g: 
1 1
2 4
3 9
4 16
5 25
6 36
7 49
8 64
9 81
10 100

 */
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" "+(int)(Math.pow(i, 2)));
		}
		

	}

}
