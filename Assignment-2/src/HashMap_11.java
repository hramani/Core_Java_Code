import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

import org.omg.CORBA.portable.InputStream;
/*
 * Define an HashMap state code and state name and print them.
 */
public class HashMap_11 {
	
	
	public static void main(String args[])
	{	
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(01,"Illinois");
		hm.put(02,"California");
		hm.put(03,"Texas");
		hm.put(04,"Florida");
		hm.put(03,"Arizona");
		
		for(Map.Entry<Integer,String> en: hm.entrySet())
		{
			System.out.println(en.getKey()+"->"+en.getValue());
		}
		
		
		
		
	}

}
