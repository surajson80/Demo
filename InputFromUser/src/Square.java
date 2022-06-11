import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of side of square : ");
		int x=sc.nextInt();
		
		System.out.println("Area of Square is = "+x*x);
		System.out.println("Perimeter of Square is = "+4*x);
	}

}
