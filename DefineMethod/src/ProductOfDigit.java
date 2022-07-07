import java.util.Scanner;

public class ProductOfDigit {
	static int checkDigit(int x)//53
	{
		int a;
		int prod = 1;
		while(x!=0)//53
		{
			a=x%10;//53,x=3,x=5
			prod=prod*a;//3+5
			x=x/10;//5,0
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		int s = checkDigit(n);
		System.out.println("Product of Digit is: " + s);
	}

}
