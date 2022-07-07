import java.util.Scanner;

public class MainPtr11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		for(int i=1;i<=n;i++)
		{
			int temp=1;
			for (int j = 1; j <= i; j++) //1
			{
				if(temp<0)
					temp=1;
				System.out.print(temp+" ");//1
				temp--;
			}
			System.out.println();
		}
	}
}
