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
public class FileRead_8 {
	
	
	public static void main(String args[]) throws IOException
	{	
        try
        {
        	File file = new File("input.txt");
    	//	FileInputStream fileStream = new FileInputStream(file);
    	//	InputStreamReader input = new InputStreamReader(fileStream);
    		BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    		int count=0;
    		String line=null;
    		while((line = bf.readLine())!=null)
    		{
    			for(int i=0;i<line.length();i++)
    			{
    				if(line.charAt(i)=='a')
    				{
    					count++;
    				}
    			}
    		}
    		System.out.println("total a is: "+count);
    		
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
		
		
	}

}
