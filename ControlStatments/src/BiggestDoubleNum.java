import java.util.Scanner;

public class BiggestDoubleNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 double Number: ");
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		double k = sc.nextDouble();

		if (i > j && i > k)
			System.out.println("Biggest no. is: " + i);
		else if (j > k)
			System.out.println("Biggest no. is: " + j);
		else
			System.out.println("Biggest no. is: " + k);

	}

}
