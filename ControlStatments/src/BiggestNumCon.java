import java.util.Scanner;

public class BiggestNumCon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int big = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Biggest is: " + big);

	}

}
