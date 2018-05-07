import java.util.Scanner;

public class Fibbonacci_1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int f1 = 1,f2 =1;
		int f3;
		System.out.print(f1+" "+f2+" ");
		for(int i=3;i<=n;i++)
		{
			f3 =f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f3+" ");
		}
		
		
	}

}
