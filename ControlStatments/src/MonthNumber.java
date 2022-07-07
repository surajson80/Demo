import java.util.Scanner;

public class MonthNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int m = sc.nextInt();
		if (m < 1)
			System.out.println("INVALID");
		else if (m > 12)
			System.out.println("INVALID");
		else
			System.out.println("VALID");
		
		
		/*if(m<1||m>12)
			System.out.println("INVALID");
		else
			System.out.println("VALID");*/
		
		
		/*if(m>=1&&m<=12)
			System.out.println("VALID");
		else
			System.out.println("INVALID");*/
		
	}

}
