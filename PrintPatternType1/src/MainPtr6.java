import java.util.Scanner;

public class MainPtr6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		int t=n;//5
		do
		{
			for (int i = 1; i <= n; i++)//1
			{
				if(i%2!=0)//1
				{
					for (int j = 1; j <= n; j++) //12345
					{
						System.out.print(t+" ");//55555
					}
					System.out.println();//line change 
				}
				else
				{
					for (int j = 1; j <= n; j++) 
					{
						System.out.print(t+" ");
					}
					System.out.println();
				}
					t--;
			}
	
		}while(t!=0);
	}
}
