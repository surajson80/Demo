import java.util.Scanner;

public class MainPtr10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();

		for (int i = 1; i <= n; i++) //1
		{
			int temp=i;
			for (int j = 1; j <= i; j++) //1
			{
				System.out.print(temp+" ");//1
				temp--;
			}
			System.out.println();
		}
	}

}
