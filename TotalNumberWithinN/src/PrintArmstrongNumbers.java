import java.util.Scanner;

public class PrintArmstrongNumbers {
	
	static int digitNumbers(int x)
	{
		int count=0;
		do {
			count++;
			x=x/10;
		}while(x!=0);
		return count;
	}
	static int pow (int b,int dn)//3 2
	{
		int prod=1;
		while(dn>0)
		{
			prod=prod*b;
			dn--;
		}
		return prod;
	}
	
	static boolean isArmstrong(int n)//154
	{
			int dn=digitNumbers(n);//3
			int sum=0,temp=n;
			
			do {
				int b=n%10;//3
				sum=sum+pow(b,dn);//0=0+27
				n=n/10;//15
			}while(n!=0); 
			return sum==temp;
	}
	static void printArmstrong(int n)
	{
		System.out.println(1+" is an Armstrong Number");
		for(int i=153;i<=n;i++)
		{
			boolean rs=isArmstrong(i);
			if(rs)
				System.out.println(i+" is an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();
		sc.close();	
		printArmstrong(n);
	}
}
