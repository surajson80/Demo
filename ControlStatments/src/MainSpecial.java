import java.util.Scanner;

public class MainSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int d1 = n / 10;
		int d2 = n % 10;

		int sum = d1 + d2 + d1 * d2;
		if (sum == n)
			System.out.println(n + " is a special two digit no.");
		else
			System.out.println(n + " is not a special two digit no.");

	}
}
