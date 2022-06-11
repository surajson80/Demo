import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ant two interger values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(x + "+" + y + "=" + (x + y));
		System.out.println(x + "+" + y + "=" + (x - y));
		System.out.println(x + "*" + y + "=" + x * y);
		System.out.println(x + "/" + y + "=" + x / y);
		System.out.println(x + "%" + y + "=" + x % y);

	}

}
