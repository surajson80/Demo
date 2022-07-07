import java.util.Scanner;

public class MainPtr8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(x+" ");
				x++;
				if(x==10)
					x=1;
			}
			System.out.println();
		}
	}

}
