import java.util.Scanner;

public class NumPrint1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		sc.close();
		
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		System.out.println("Thank you");
		
	
		
/*		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			
		}
//		System.out.println(i);//Compile time error
		System.out.println("Thank You");
		
*/		
	}

}
