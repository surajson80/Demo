import java.util.Scanner;

public class MainPtr18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}
