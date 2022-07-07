import java.util.Scanner;

public class MainPtr15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();// 5
		sc.close();
		for (int i = 1; i <= n; i++) 
		{
			if (i % 2 != 0) 
			{
				for (int j = 1; j <= i; j++) // 1
				{
					System.out.print(1+" ");
				}
				System.out.println();
			} 
			else 
			{
				for (int j = 1; j <= i; j++) // 1
				{
					System.out.print(0+" ");
				}
				System.out.println();
			}

		}
	}
}
