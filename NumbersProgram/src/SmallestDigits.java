import java.util.Scanner;
public class SmallestDigits {
	static int smallestDigits(int x) 
	{
		int small = x % 10;
		do {
			int r = x % 10;
			if (r < small) 
			{
				small = r;
			}
			x = x / 10;
		} while (x != 0);
		return small;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int sd = smallestDigits(n);
		System.out.println("Biggest Digits is: " + sd);
	}
}