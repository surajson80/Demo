import java.util.Scanner;

public class MainBiggest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y&&x>z)
			System.out.println("Biggest is : "+x);
		else if(y>z)
			System.out.println("Biggest is : "+y);
		else
			System.out.println("Biggest is : "+z);

	}

}
