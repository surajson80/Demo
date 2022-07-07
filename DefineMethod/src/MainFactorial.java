import java.util.Scanner;

public class MainFactorial {
	static int getFact(int x)
	{
		int fact=1;
		while(x>1)
		{
			fact=fact*x;
			x--;
		}
		return fact;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+"!="+getFact(i));
		}
	}

}
