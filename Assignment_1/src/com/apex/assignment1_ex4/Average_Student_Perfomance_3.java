package com.apex.assignment1_ex4;

import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/2/2018
 *
 */

/*
 * Exercise 4:
Your university asked you to develop a java application to calculate the average of the student's performance. 
Create 6 int variables sub1,sub2,...sub6. give some values to subjects and find the total marks and average of the student
 */
public class Average_Student_Perfomance_3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5,sub6;
		for(int i =1;i<=3;i++)
		{
			System.out.println("Enter the marks for student"+i);
			System.out.println("Enter the value of subject 1");
			sub1 = sc.nextInt();
			System.out.println("Enter the value of subject 2");
			sub2 = sc.nextInt();
			System.out.println("Enter the value of subject 3");
			sub3 = sc.nextInt();
			System.out.println("Enter the value of subject 4");
			sub4 = sc.nextInt();
			System.out.println("Enter the value of subject 5");
			sub5 = sc.nextInt();
			System.out.println("Enter the value of subject 6");
			sub6 = sc.nextInt();
			int total = sub1+sub2+sub3+sub4+sub5+sub6;
			System.out.println("Total marks is"+total);
			System.out.println("Average is"+(total/6));
		}
	
	}
	
	

}
