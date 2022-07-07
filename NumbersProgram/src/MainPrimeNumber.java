import java.util.Scanner;

public class MainPrimeNumber {
	static boolean isPrimeNumber(int x) 
	{
////////////////////////////////////////////////////////////////////////
/*		int count = 1;
		for (int i = 1; i <= x / 2; i++) 
		{
			if (x % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;      */
//////////////////////////////////////////////////////////////////////
		
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		boolean nm = isPrimeNumber(n);
		if (nm == true)
			System.out.println(n + " is Prime Number.");
		else
			System.out.println(n + " is not a Prime Number.");
	}

}
