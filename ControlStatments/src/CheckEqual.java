import java.util.Scanner;

public class CheckEqual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integer Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x==y)
			System.out.println("Integers are Equal.");
		else
			System.out.println("Integers are not Equal");

	}

}
