import java.util.Scanner;
public class DecimalToOctal {
	static String decToOct(int dec)
	{
		String oct="";
		do {
			int b=dec%8;
			oct=b+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		sc.close();
		
		String dt=decToOct(n);
		System.out.println("decimal to octal: "+dt);
	}

}
