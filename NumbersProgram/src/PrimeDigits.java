import java.util.Scanner;
public class PrimeDigits {
	static int primeDigits(int x)
	{
		int count=0;
		do {
			int r=x%10;
			 if(r==1||r==2||r==3||r==5||r==7)
				 count++;
			 x=x/10;
		}while(x!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int pd=primeDigits(n);
		System.out.println("Prime Digits are: "+pd);
	}
}
