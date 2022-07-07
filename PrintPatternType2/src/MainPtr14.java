import java.util.Scanner;

public class MainPtr14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) 
		{
			int x=i;
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= 2*i-1; j++) 
			{
					if(j>=i)
					{
						System.out.print(x+" ");
						x++;
					}
					else
					{
						System.out.print(x + " ");
						x--;
					}
			}

			System.out.println();
		}
	}
}
