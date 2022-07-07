import java.util.Scanner;

public class NumPrint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		sc.close();
		
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
		
/*		for(;n>=0;n--)
		{
			System.out.println(n);
		}
*/		
		
	}

}
