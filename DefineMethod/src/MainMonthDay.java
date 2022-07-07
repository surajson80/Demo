import java.util.Scanner;
public class MainMonthDay {
	static int getNoOfDays(int x)
	{
		if(x==1||x==3||x==5||x==7||x==8||x==10||x==12)
			return 31;
		else if(x==4||x==6||x==9||x==11)
			return 30;
		else
			return 28;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int month=sc.nextInt();
		sc.close();
		
		if(month<0||month>12)
			System.out.println("Invalid Month Number");
		else
			System.out.println("Number of Days: "+getNoOfDays(month));
		
		

	}
	

}
