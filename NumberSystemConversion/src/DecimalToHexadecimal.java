import java.util.Scanner;
public class DecimalToHexadecimal {
	static String decToHexa(int dec)//45------2D
	{
		String hx="";
		do {
			int b=dec%16;
			if(b<10)
				hx=b+hx;
			else
				hx=(char)(b+55)+hx;	
			dec=dec/16;
		}while(dec!=0);
		return hx;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		sc.close();
		
		String dh=decToHexa(n);
		System.out.println("decimal to hexadecimal: "+dh);
	}

}
