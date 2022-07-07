import java.util.Scanner;

public class MainPtr9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=sc.nextInt();
		sc.close();
		int sp=n-1,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=st;j++)
			{
				if(j%2==0)
					System.out.print("  ");
				else
				{
					System.out.print(x+" ");
					if(x<n/2)
						x--;
					x++;
				}

			}
				sp--;
				st=st+2;
			System.out.println();
		}
	}
}
