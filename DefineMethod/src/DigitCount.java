import java.util.Scanner;

public class DigitCount {

	static int getDigit(int x) 
	{
		int count = 0;
		do {
			x = x / 10;
			count++;
		} while (x != 0);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		System.out.println("No of digit: " + getDigit(n));

	}
}
