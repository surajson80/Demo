import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) 
			{
				System.out.println(n + " is not Prime Number");
				return;
			}
		}
		System.out.println(n + " is a Prime Number");

	}

}
