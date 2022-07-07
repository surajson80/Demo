import java.util.Scanner;

public class MainPtr14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		
		int k=1;
		int temp=n;
		for(int i=1;i<=n;i++)//1
		{
			int t=k;
			for (int j = 1; j <= temp; j++)//1
			{
				System.out.print(t+" ");
				t++;
			}
			temp--;
			System.out.println();
			k++;
		}
	}
}
