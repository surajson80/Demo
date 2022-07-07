import java.util.Scanner;

public class MainBiggest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 integer value : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int big=x;
		if(y>x)
			big=y;
		if(z>x)
			big=z;
		System.out.println("Biggest is: "+big);

	}

}
