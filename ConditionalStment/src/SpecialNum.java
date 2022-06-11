import java.util.Scanner;

public class SpecialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int d1 = x / 10;
		int d2 = x % 10;
		sc.close();

		int check = d1 + d2 + d1 * d2;
		String z = (x == check) ? " is special number" : " is not a special number";
		System.out.println(x + z);

	}

}
