import java.util.Scanner;
public class MainCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of a circle : ");
		double rd=sc.nextDouble();
		System.out.println("Radius is: "+rd);
		System.out.println("Area is: "+3.143*rd*rd);
		System.out.println("Circumference is: "+2*3.143*rd);
	}

}
