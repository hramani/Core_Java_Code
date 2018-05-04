package com.apex.demo;

public class demo {
	public static String name="hiral";
	public demo() 
	{
		//demo.name="hiral";
	}

	public static void main(String arg[])
	{
		
		demo demoObj= new demo();
		demo demoObj2= new demo();
		
		System.out.println(demo.name);
		demoObj.name="new_Hiral";
		System.out.println(demoObj2.name);
		
	}
}
