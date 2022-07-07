import java.util.Scanner;

public class PerfectNumber {
	
///////////////////////////////////////////////////////////////////////////////////		
/* static String checkNum(int x)
	{
/*		int sum=0;
		for(int i=1;i<x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
			{
				if(sum==x)
					return "A perfect Number";
				else
					return "Not a Perfect number";
			}
			
		}  */
		
/////////////////////////////////////////////////////////////////////////////////////
		
		static boolean checkNum(int n)
		{
			int sum=0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
					{
						if(sum==n)
							return true;
					}
				}
			}
			return false;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		
		boolean check=checkNum(n);
		if(check==true)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+ " is not a perfect number");
		
	}

}
