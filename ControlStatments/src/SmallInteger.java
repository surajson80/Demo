import java.util.Scanner;

public class SmallInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 integer Number: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();

		int small = p;
		if (q < small)
			q = small;
		if (r < small)
			r = small;
		if (s < small)
			s = small;

		System.out.println("Smallest integer is: " + small);

	}

}
