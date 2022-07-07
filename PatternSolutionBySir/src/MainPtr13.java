import java.util.Scanner;

public class MainPtr13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
