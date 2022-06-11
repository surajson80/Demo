import java.util.Scanner;

public class MiddelNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		/*
		 * if (x > y && x < z || x < y && x > z) System.out.println(x +
		 * " is middel value"); else if (y > x && y < z || y < x && y > z)
		 * System.out.println(y + " is middel value"); else System.out.println(z +
		 * " is middel value");
		 */

		int max = (x > y) ? x : y;
		max = (max > z) ? max : z;
		
		//int max=(x>y&&x>z)?x:(y>z?y:z);

		int min = (x < y) ? x : y;
		min = (min < z) ? min : z;
		//int min=(x<y&&x<z)?x:(y<z?y:z);

		System.out.println((x + y + z) - (max + min) + " is middel value");
		//                  (12 + 15+ 20)-(20+12)=15

	}

}
