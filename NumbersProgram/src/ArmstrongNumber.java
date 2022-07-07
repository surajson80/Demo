
public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int n=153;
		int lastDigit;
		int cubeOfLastNum=0;
		int temp=n;
		while(temp>0)//153>0//15>0
		{
			lastDigit=temp%10;//153%10=3//15%10=5
			temp=temp/10;         //153/10=15//15/10=1
			cubeOfLastNum=cubeOfLastNum+(lastDigit*lastDigit*lastDigit);
			                              //(3*3*3)
			                            //9+(5*5*5)
		}	
		if(n==cubeOfLastNum)
			System.out.println(n+" is Armstrong Number");
		else
			System.out.println(n+" is not Armstrong Number");

	}

}
