import java.util.Scanner;
public class PrintPrimeNumbers {
	
/*
	static boolean isPrime(int x)
	{
		for(int j=2;j<=x/2;j++)
		{
			if(x%j==0)
				return false;
		}
		return true;
	}
	
	static void printPrime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
				System.out.println(i);
		}
	}
	
*/
	static void printPrime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			boolean rs=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					rs=false;
					break;
				}
			}
			if(rs)
				System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();//20
		sc.close();
		
		printPrime(n);//1 2 3 5 7 11 13 17 19
	}

}
