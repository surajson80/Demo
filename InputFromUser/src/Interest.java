import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amt of Principal p: ");
		int p = sc.nextInt();

		System.out.println("Enter the amt of rate of interest R: ");
		double r = sc.nextDouble();

		System.out.println("Enter the Time T: ");
		int t = sc.nextInt();

		System.out.println("S.I. = " + (p * r * t) / 100);

	}

}
