import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Length:-");
		int l = sc.nextInt();

		System.out.println("Enter the value of Breadth:-");
		int b = sc.nextInt();

		System.out.println("Area of Rectangle is = " + l * b);
		System.out.println("Perimeter of Rectange is = " + 2 * (l + b));
	}

}
