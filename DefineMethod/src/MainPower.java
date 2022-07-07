import java.util.Scanner;
public class MainPower {
	
	static int pow(int n,int p)//4,3=4^3=4*4*4
	{
		int prod=1;
		while(p>0)//3/2/1/0
		{
			prod=prod*n;//1*4=4*4=16*4
			p--;//2/1/0
		}
		return prod;//64
	}
	
	public static void main(String[] args) {
		System.out.println(pow(4,3));//64
		System.out.println(pow(4,0));//1
		System.out.println(pow(0,3));//0
		System.out.println(pow(4,1));//4
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers p to the power of n (n,p): ");
		int n = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		
		int value=pow(n,p);
		System.out.println("The value of p to the power of n (n,p) is: "+value);

	}

}
