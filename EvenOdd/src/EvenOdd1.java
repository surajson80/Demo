import java.util.Scanner;
public class EvenOdd1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		sc.close();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}

}
