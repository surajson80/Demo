import java.util.Scanner;

public class MainPtr18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();

		for (int i = 1; i <= n; i++) //1
		{
			int temp=(char)(70-i);//70-1=69/70-2=68
			for (int j = 1; j <= i; j++) //1
			{
				System.out.print((char)(temp)+" ");//1
				temp++;
			}
			System.out.println();
		}
	}
}
