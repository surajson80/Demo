import java.util.Scanner;

public class MainPtr20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(x+96)+" ");
				x++;
			}
			System.out.println();
		}
	}
}
