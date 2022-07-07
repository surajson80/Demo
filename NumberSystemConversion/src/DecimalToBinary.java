import java.util.Scanner;
public class DecimalToBinary {
	static String decToBin(int dec)//56
	{
		String bin="";
		do {
			int b=dec%2;
			bin=b+bin;
			dec=dec/2;	
		}while(dec!=0);
		return bin;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		sc.close();
		
		String db=decToBin(n);
		System.out.println("decimal to binary: "+db);
	}

}
