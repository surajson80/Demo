import java.util.Scanner;

public class MainPtr13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		
		int temp=n;
		for(int i=1;i<=n;i++)//1
		{
			int k=temp;
			for (int j = 1; j <= temp; j++)//1
			{
				System.out.print(k+" ");
				k--;
			}
			temp--;
			System.out.println();
		}
	}

}
