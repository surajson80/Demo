import java.util.Scanner;

public class MainPtr17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();

		for (int i = 1; i <= n; i++) //1
		{
			int temp=(char)(i+64);
			for (int j = 1; j <= i; j++) //1
			{
				System.out.print((char)(temp)+" ");//1
				temp--;
			}
			System.out.println();
		}
	}

}
