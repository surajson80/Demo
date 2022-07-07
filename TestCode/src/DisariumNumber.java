import java.util.Scanner;
public class DisariumNumber {
	
	static int countLength(int n)//123
	{
		int count=0;
		do {
			count++;//1/2/3
			n=n/10;//12/1/0
		}while(n!=0);
		return count;//3
	}
	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
	
	static boolean isDisarium(int x)//123
	{
		int p=countLength(x);//3
		int sum=0,temp=x;
		do {
			int d=x%10;//3/2/1
			sum=sum+pow(d,p);//0+pow(3,3)=27/27+pow(2,2)=31/31+pow(1,1)=32
			p--;//2/1/0
			x=x/10;//12/1/
		}while(x!=0);
		return sum==temp;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		boolean dn=isDisarium(n);
		if(dn==true)
			System.out.println(n+" is disarium number.");
		else
			System.out.println(n+" is not a disarium number.");
	}

}
