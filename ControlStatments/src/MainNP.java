import java.util.Scanner;

public class MainNP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if(n>=0)
			System.out.println(n+" is positive");
		else
			System.out.println(n+" is negative");
	}

}
