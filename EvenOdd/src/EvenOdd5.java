import java.util.Scanner;

public class EvenOdd5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		if((n&1)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
