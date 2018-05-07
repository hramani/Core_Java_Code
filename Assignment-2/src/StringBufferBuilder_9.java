import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;
/*
 * Generate 1000 numbers
Generate multiple of 5 and less than 1000
Generate odd numbers up to 1000
 */
public class StringBufferBuilder_9 {
	
	
	public static void main(String args[])
	{	
		//String Buffer Implementation
		
       StringBuffer sbuffer= new StringBuffer("Washington is");
       long capacity= sbuffer.capacity();
       System.out.println(sbuffer);
       sbuffer.append(" Capital of United States");
       System.out.println(sbuffer +"\n"+"StringBuffer Capacity is :"+capacity);
       System.out.println();
       sbuffer = new StringBuffer("Try to change the StringBuffer objcet value");
       System.out.println(sbuffer);
       // String Builder implementation
       
       StringBuilder sbuilder= new StringBuilder("Delhi is");
       long capacity2= sbuilder.capacity();
       System.out.println(sbuilder);
       sbuilder.append(" Capital of India");
       System.out.println(sbuilder+"\n"+"StringBuilder Capacity is :"+capacity2);
       sbuilder = new StringBuilder("Try to change the StringBuilder objcet value");
       System.out.println(sbuilder);
       
       
		
		
	}

}
