import java.util.Scanner;

public class PrintHappyNumber {
	static boolean isHappy(int x)
	{
		while(x>9)
		{
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1||x==7;
	}
	
	static void printHappyNumber(int m,int n)
	{
		int i=m;
		for(i;i<=n;i++)
		{
			boolean rs=isHappy(n);
			if(rs)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range between m and n: ");
		int m=sc.nextInt();
		int n=sc.nextInt();

		sc.close();
		printHappyNumber(m,n);
	}

}
