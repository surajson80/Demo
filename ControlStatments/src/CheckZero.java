import java.util.Scanner;

public class CheckZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x = sc.nextInt();
		
		if(x==0)
			System.out.println("Number is Zero.");
		else
			System.out.println("Number is not Zero.");
	}

}
