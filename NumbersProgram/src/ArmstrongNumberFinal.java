import java.util.Scanner;

public class ArmstrongNumberFinal {
	
	static int countDigits(int n)//12345
	{
		int count=0;
		do {
			count++;//1/2/3/4/5(final)
			n=n/10;//1234/123/12/1/0
		}while(n!=0);//+/+/+/+/-
		return count;
	}
	
	static int pow(int d,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*d;
			p--;
		}
		return prod;			
	}
	

	static boolean isArmstrong(int x) //153
	{
		int p=countDigits(x);//3
		int sum=0,temp=x;
		do {
			int d=x%10;//3/5/1
			sum=sum+pow(d,p);//0+pow(3,3)=27/27+pow(5,3)=152/152+pow(1,3)=153
			x=x/10;//15/1/0
		}while(x!=0);//+/+/-
		return sum==temp;//153==153
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean am = isArmstrong(n);

		if (am == true)
			System.out.println(n + " is Armstrong Number.");
		else
			System.out.println(n + " is not an Armstrong Number.");

	}

}
