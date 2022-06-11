import java.util.Scanner;

public class Temprature {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in celcius: ");
		int x=sc.nextInt();
		
		System.out.println("Same temp in Fahrenheit = "+ (x*9/5+32));
		System.out.println("Same temp in Kelvin = "+ (x+273.15));


	}

}
