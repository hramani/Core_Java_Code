package com.apex.assignment5_ex1;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author hiral
 * @since 5/4/2018
 */

/*
 * Exercise 2:
repeat the above code for different primitive datatypes int, long, float, double try to change s1 values like 365,35000,65398,1212673984, 1212673984, 12345678901234567890123
 */
public class ShortTest2 {

	
		public static void main (String[] args)
		  {
			BigInteger s1=new BigInteger("3653500065398");
			BigInteger s2=new BigInteger("36535000653981212673984");
			BigInteger s3=new BigInteger("123456789012345678901234444444444444444444444444444444444444444448");
			BigInteger s4=new BigInteger("3653500065398");
		    System.out.println("A s1: " +  s1);
		    System.out.println("A s2: " +  s2);
		    System.out.println("A s3: " +  s3);
		    System.out.println("A s4: " +  s4);
		  }
}
