import java.util.Scanner;

public class MainPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the interger value : ");
		int x = sc.nextInt();

		if (x < 0)
			x = x * -1;
		System.out.println("Entered integer is : " + x);

	}

}
