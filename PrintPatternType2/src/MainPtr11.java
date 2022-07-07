import java.util.Scanner;

public class MainPtr11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		sc.close();
		
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) 
			{
				if(j>=i)
					System.out.print(2*i-j+" ");
				else
					System.out.print(j + " ");
			}

			System.out.println();
		}
	}

}
