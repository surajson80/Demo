import java.util.Scanner;

public class MainPtr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++)
		{
			if(i%2!=0) 
			{
				for (int j = 1; j <= n; j++) 
				{
					if(j%2!=0)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
				}
				System.out.println();

			}
			else
			{
				for (int j = 1; j <= n; j++) 
				{
					if(j%2!=0)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
				}
				System.out.println();

			}
		}
	}

}
