import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.CORBA.portable.InputStream;
/*
 * Define an arraylist of states of USA and print them. Use Hashset, Treeset and notice
 * the differnce
 * TreeSet elements are sorted in ascending order
 */
public class HashsetTreeset_10 {
	
	
	public static void main(String args[])
	{	
		ArrayList Astates = new ArrayList();
		Astates.add("Texas");
		Astates.add("Washington");
		Astates.add("Indiana");
		Astates.add("California");
		Astates.add("Illinois");
		System.out.println(".........ArrayList...........");
		for (int i = 0; i < Astates.size(); i++) {
	         System.out.println(Astates.get(i));
	      }
		
		//...................HashSet....................
		HashSet<String> hset = new HashSet<String>();
		 
	     hset.add("Texas");
	     hset.add("Washington");
	     hset.add("Indiana");
	     hset.add("California");
	     hset.add("Illinois");
	     System.out.println(".........HashSet...........");
	     for(String state : hset){
	         System.out.println(state);
	      }
		
	     //....................TreeSet..................
	     TreeSet<String> tset = new TreeSet<String>();
		 
	     tset.add("Texas");
	     tset.add("Washington");
	     tset.add("Indiana");
	     tset.add("California");
	     tset.add("Illinois");
	     System.out.println(".........TreeSet...........");
	     for(String Tstate : tset){
	         System.out.println(Tstate);
	      }
		
	}

}
