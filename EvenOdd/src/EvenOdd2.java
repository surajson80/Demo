import java.util.Scanner;

public class EvenOdd2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		sc.close();
		
		if(n/2*2==n) 
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}

}
