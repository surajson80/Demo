//Basically it is for 3 digit Armstrong number.
public class ArmstrongNumber {
	static void checkNum(int n)
	{
		int a;
		int sum=0;
		int temp=n;
		while(temp>0)
		{
			a=temp%10;
			temp=temp/10;
			sum=sum+(a*a*a);
		}	
		if(sum==n)
			System.out.println(n+" is Armstrong Number");
		else
			System.out.println(n+" Not Armstrog Number");
	}
	
	public static void main(String[] args) {
		checkNum(370);
		checkNum(153);
		checkNum(121);


		
	}

}
