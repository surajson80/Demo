import java.util.Scanner;

public class DigitNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int n = sc.nextInt();
		
		if(n<0||n>9)
			System.out.println("Not Digit");
		else
			System.out.println("Digit");
		
	}

}
