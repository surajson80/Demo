import java.util.Scanner;

public class BiggestDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 double Number: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		double big = x;
		if (y > big)
			big = y;
		if (z > big)
			big = z;
		System.out.println("Biggest is: " + big);

	}

}
