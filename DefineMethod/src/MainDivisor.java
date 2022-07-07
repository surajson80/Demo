import java.util.Scanner;

public class MainDivisor {
	static int countDivisors(int x) 
	{
		int count = 1;
		for (int i = 1; i <= x / 2; i++) 
		{
			if (x % i == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		int dc = countDivisors(n);
		System.out.println("Number of Divisor: " + dc);
	}

}
