import java.util.Scanner;

public class StrongNumber {

	static boolean isStrong(int n)// 123
	{
		int sum = 0, temp = n;
		do {
			int d = n % 10;
			sum = sum + fact(d);
			n = n / 10;
		} while (n != 0);

		/*
		 * if(sum==temp) 
		 * return true; 
		 * else 
		 * return false;
		 */

		return sum == temp;
	}

	static int fact(int d) 
	{
		int fact = 1;
		while (d > 1) 
		{
			fact = fact * d;
			d--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean st = isStrong(n);

		if (st == true)
			System.out.println(n + " is a Strong Number.");
		else
			System.out.println(n + " is not a Strong Number.");
	}

}
