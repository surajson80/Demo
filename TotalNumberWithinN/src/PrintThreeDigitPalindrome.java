import java.util.Scanner;

public class PrintThreeDigitPalindrome {
	static boolean isPalindrome(int x)
	{
		int temp=x/10;
		int b=x%10;
		temp=temp/10;
		if(temp!=b)
		{
			return false;
		}
		return true;
	}
	
	static void printPalindrome(int n)//343
	{
		for(int i=100;i<=n;i++)
		{
			boolean rs=isPalindrome(i);
			if(rs)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the max 3 digit Range: ");
		int n=sc.nextInt();//343
		sc.close();
		
		printPalindrome(n);
	}

}
