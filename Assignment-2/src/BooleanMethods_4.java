import java.util.Scanner;

public class BooleanMethods_4 {
	
	public static Boolean IsInteger(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
		
	}
	
	public static Boolean IsOddNumber(String str)
	{
		if(Integer.valueOf(str)%2!=0)
		{
			return true;
		}
		else
			return false;
	}
	public static Boolean IsEvenNumber(String str)
	{
		if(Integer.valueOf(str)%2==0)
		{
			return true;
		}
		else
			return false;
		
	}
	public static Boolean IsPrimeNumber(String str)
	{
		int flag=0;
		for(int i=2;i<=Integer.valueOf(str);i++)
		{
			if(Integer.valueOf(str)%i==0)
			{
				if(i==Integer.valueOf(str))
					continue;
				flag=0;
				break;
			}
			else
				flag=1;
		}
		if(flag!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = sc.next();
		System.out.println(" Number is an Integer "+IsInteger(number));
		System.out.println(" Number is Odd "+ IsOddNumber(number));
		System.out.println(" Number is an Even "+ IsEvenNumber(number));
		System.out.println(" Number is Prime "+ IsPrimeNumber(number));
		
			

	}

}
