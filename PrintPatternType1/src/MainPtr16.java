import java.util.Scanner;

public class MainPtr16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();

		for(int i=1;i<=n;i++)//1
		{
			for (int j = 1; j <= i; j++) //1
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
