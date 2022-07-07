import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the number: ");
		int n=sc.nextInt();
		sc.close();
		
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<n;i++)
		{
			 num3 = num1+num2;
			 System.out.println(num3);
			 num1=num2;
			 num2=num3;
		}
		
		
	}

}
