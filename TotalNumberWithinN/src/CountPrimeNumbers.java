import java.util.Scanner;
public class CountPrimeNumbers {
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
	
	static int countPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
				count++;
		}
		return count;
	}
	*/
	static int countPrime(int n)//20
	{
		int count=n;//20
		for(int i=1;i<=n;i++)//1
		{
			for(int j=2;j<=i/2;j++)//
			{
				if(i%j==0)
				{
					count--;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();//20
		sc.close();
		
		int pc=countPrime(n);
		System.out.println("Number of Prime Number within "+n+" is "+pc);
	}

}
