import java.util.Scanner;

public class SumDivisors {
	
	static int sumOfDivisors(int n)
	{
		int sum=n;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		int sm=sumOfDivisors(n);
		System.out.println("Sum of Divisors: "+sm);
	}

}
