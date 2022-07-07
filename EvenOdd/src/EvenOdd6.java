import java.util.Scanner;

public class EvenOdd6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		String st = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(n + " is " + st);
	}

}
