import java.util.Scanner;

public class MainPtr7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();//5
		sc.close();

		for (int i = 1; i <= n; i++)//1
			{
				for(int j=1;j<=n;j++)//1
				{
					char temp=(char)(j+64);//A
					System.out.print(temp+" ");//A
				}
				System.out.println();	
			}
	
		
		
		
		
		
		
		
		
		
		
//		for (int i = 1; i <= n; i++)
//		{
//			if(i%2!=0) 
//			{
//				for (int j = 1; j <= n; j++) 
//				{
//					if(j%2!=0&&j==1)
//						System.out.print("A ");
//					else if(j%2==0&&j==2)
//						System.out.print("B ");
//					else if(j%2!=0&&j==3)
//						System.out.print("C ");
//					else if(j%2==0&&j==4)
//						System.out.print("D ");
//					else if(j%2!=0&&j==5)
//						System.out.println("E ");
//				}
//				System.out.println();
//
//			}
//			else
//			{
//				for (int j = 1; j <= n; j++) 
//				{
//					if(j%2!=0&&j==1)
//						System.out.print("A ");
//					else if(j%2==0&&j==2)
//						System.out.print("B ");
//					else if(j%2!=0&&j==3)
//						System.out.print("C ");
//					else if(j%2==0&&j==4)
//						System.out.print("D ");
//					else if(j%2!=0&&j==5)
//						System.out.println("E ");
//				}
//				System.out.println();
//
//			}
//		}

//		char a=(char)(65);
//	System.out.println(a);
	}
}
