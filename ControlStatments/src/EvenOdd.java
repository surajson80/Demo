import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		int x=n%2;
		if(x==0)
			System.out.println(n+" is even Number.");
		else
			System.out.println(n+" is odd Number.");

	}

}
