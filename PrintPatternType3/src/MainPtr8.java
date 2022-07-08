import java.util.Scanner;

public class MainPtr8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=sc.nextInt();
		sc.close();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int x=sp+1;
			for(int j=1;j<=st;j++)
			{
				
					System.out.print(j+" ");
				if(j<st)
					System.out.print("* ");
					
			}
			if(i<=n/2)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
			System.out.println();
		}
	}
}
