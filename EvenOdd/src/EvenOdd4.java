import java.util.Scanner;

public class EvenOdd4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		String st[] = { "Even", "Odd" };
		System.out.println(n + " is " + st[n % 2]);

	}
}
