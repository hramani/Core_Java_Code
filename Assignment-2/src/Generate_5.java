import java.util.Scanner;
/*
 * Generate 1000 numbers
Generate multiple of 5 and less than 1000
Generate odd numbers up to 1000
 */
public class Generate_5 {
	
	
	public static void main(String args[])
	{
		System.out.println(".....................1 to 1000........................");
		for(int i=1;i<=1000;i++)
		{
			System.out.print(i+" ,");
		}
		System.out.println();
		System.out.println();
		System.out.println(".....................multiple of 5........................");
		for(int i=1;i<=1000;i++)
		{
			if(i%5==0)
				System.out.print(i+" ,");
			else
				continue;
		}
		System.out.println();
		System.out.println();
		System.out.println(".....................odd number........................");
		for(int i=1;i<=1000;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ,");
			else
				continue;
		}
		
		
	}

}
