import java.util.Scanner;

public class MainPtr8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		int t = 1;
		while (t <= n)// yes
		{
			for (int i = 1; i <= n; i++) // 1
			{
				for (int j = 1; j <= n; j++) // 1
				{
					if (t <= 9) 
					{
						System.out.print(t + " ");// 12345
						t++;// 2345
					} else 
					{
						t = 1;
						System.out.print(t + " ");
						t++;
					}
				}
				System.out.println();
			}
		}
	}
}
