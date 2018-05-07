import java.util.Scanner;

public class BasicCalulator_3 {
	
	private static int Calculate(int choice, int a,int b)
	{
		int result=0;
		switch(choice)
		{
			case 1:
			{
				result = a+b;
				break;
			}
			case 2:
			{
				result = a*b;
				break;
			}
			case 3:
			{
				result = a/b;
				break;
			}
			case 4:
			{
				result = a-b;
				break;
			}
			default :
			
				System.out.println("Please enter valid choice");
			
			
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Choose from below operations :");
		System.out.println("1 -> Addition :");
		System.out.println("2 -> Multiplication :");
		System.out.println("3 -> Division :");
		System.out.println("4 -> Substraction :");

		int Choice = sc.nextInt();
		System.out.println("Answer is "+Calculate(Choice,a,b));
		
		
		
	}

}
