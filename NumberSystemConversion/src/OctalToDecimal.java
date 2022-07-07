import java.util.Scanner;

public class OctalToDecimal {
	static int octToDec(int oct)
	{
		int pw=1,dec=0;
		do {
			int d=oct%10;
			dec=dec+pw*d;
			pw=pw*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a octal number: ");
		int n = sc.nextInt();
		sc.close();
		int od=octToDec(n);
		System.out.println("octal to decimal: "+od);
	}

}
