import java.util.Scanner;

public class MainPtr20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();// 5
		sc.close();

		for (int i = 1; i <= n; i++) // 1/2
		{
			int temp = (char) (i + 96);// 1+96=97/2+96=98/3+96=99
			for (int j = 1; j <= i; j++) // 1
			{
				System.out.print((char) (temp) + " ");// a/bc/
				temp++;// 97/98/99
			}
			System.out.println();
		}
	}
}
