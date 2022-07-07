import java.util.Scanner;

public class HappyNumber {

	static boolean isHappy(int x)//23
	{
		while(x>9)//+|+|+
		{
			int sum=0;
			do {
				int d=x%10;//3/2|3/1|0/1
				sum=sum+d*d;//9/13|9/10|0/1(final)
				x=x/10;//2/0|1/0|1/0
			}while(x!=0);//+/-|+/-|+/-
			x=sum;
		}
		return x==1||x==7;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		boolean dn = isHappy(n);
		if (dn == true)
			System.out.println(n + " is Happy number.");
		else
			System.out.println(n + " is not a Happy number.");
	}

}
