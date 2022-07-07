import java.util.Scanner;

public class SmallestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integer number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x<y&&x<z)
			System.out.println("Smallest number is : "+x);
		else if(y<z)
			System.out.println("Smallest number is : "+y);
		else
			System.out.println("Smallest number is : "+z);

	}

}
