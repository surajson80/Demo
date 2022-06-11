import java.util.Scanner;

public class EqualNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		String z=(x==y)?"Equal":"Not equal";
		System.out.println(z);
	}

}
