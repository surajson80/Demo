import java.util.Scanner;

public class MainPtr10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=sc.nextInt();
		sc.close();
		int sp=n/2,st=n;
		for(int i=1;i<=n;i++)
		{
			if(i>1&&i<n)
			{
			for(int j=1;j<=st;j++)
			{
					System.out.print("* ");
			}	
			System.out.println();
			}
			else
			{
				for(int j=1;j<=st;j++)
				{
						System.out.print("* ");
						if(j>st/2+1)
							System.out.print("  ");

				}
				st=st-2;
			}
			System.out.println();
		}
	}

}
