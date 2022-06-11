import java.util.Scanner;

public class Stick {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of stick in cm : ");
		double l=sc.nextDouble();
		
		System.out.println("Length in inches = "+l/2.54);
		System.out.println("Length in feets = "+l/30.48);
		System.out.println("Length in meters = "+l/100);
	}

}
