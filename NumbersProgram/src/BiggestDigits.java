import java.util.Scanner;

public class BiggestDigits {
	static int biggestDigits(int x) 
	{
		int big = x % 10;
		do {
			int r = x % 10;
			if (r > big) 
			{
				big = r;
			}
			x = x / 10;
		} while (x != 0);
		return big;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int bd = biggestDigits(n);
		System.out.println("Biggest Digits is: " + bd);
	}
}
