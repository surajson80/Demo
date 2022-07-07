import java.util.Scanner;

public class SumOfPrimeNumbers {
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
	
	static int sumOfPrime(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
				sum=sum+i;
		}
		return sum;
	}
	*/
	static int sumOfPrime(int n)
	{
		int sum=0;
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
				sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();//20
		sc.close();
		
		int pc=sumOfPrime(n);
		System.out.println("Sum of Prime Number within "+n+" is "+pc);
	}

}
