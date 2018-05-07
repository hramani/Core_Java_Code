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
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

import org.omg.CORBA.portable.InputStream;
/*
 *Define a class with three fields state code, state name and capitals. And define 10
states. And save in an arraylist. And, print all the objects.
 */
public class ObjectsInArrayList_12 {
	
	
	public static void main(String args[])
	{	
		ArrayList<State> listObject = new ArrayList<State>();
		State st1 = new State(01, "Illinois", "Icapital");
		State st2 = new State(02, "California", "Ccapital");
		listObject.add(st1);
		listObject.add(st2);
		
		Iterator it = listObject.iterator();
		
		while(it.hasNext())
		{
			State stobj= (State) it.next();
			System.out.println(stobj.stateCode);
			System.out.println(stobj.stateName);
			System.out.println(stobj.stateCapital);
			
		}
		
	}

}

class State
{
	int stateCode;
	String stateName;
	String stateCapital;
	
	State(int stateCode, String stateName, String stateCapital)
	{
		this.stateCode=stateCode;
		this.stateName=stateName;
		this.stateCapital=stateCapital;
	}
	
}
