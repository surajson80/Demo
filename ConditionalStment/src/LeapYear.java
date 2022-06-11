import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one year num : ");
		int x = sc.nextInt();
		sc.close();

		if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
			System.out.println("Leap Year");
		else
			System.out.println(x + " Not Leap Year");

	}

}
