import java.util.Scanner;
public class BinaryToDecimal {
	static int binToDec(int bin)//11011
	{
		int pw=1,dec=0;
		do {
			int d=bin%10;//1/1/0/1/1
			dec=dec+pw*d;//0+1*1=1/1+2=3/3+4*0=3/3+8*1=11/11+16*1=27
			pw=pw*2;	//2/4/8/16/32
			bin=bin/10;//1101/110/11/1/0
		}while(bin!=0);
		return dec;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int n = sc.nextInt();
		sc.close();
		
		int bd=binToDec(n);
		System.out.println("binary to decimal: "+bd);
	}

}
