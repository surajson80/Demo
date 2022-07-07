import java.util.Scanner;
public class ValidDate {
	static String checkDate(int dd,int mm,int yy)
	{
		if(dd<1||dd>31||mm<1||mm>12||yy<1)
			return "Invalid Date";
		else if(mm==4||mm==6||mm==9||mm==11&&dd>30)
			return "Invalid Date";
		else if(mm==2&&dd>29)
			return "Invalid Date";
		else if(!(yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&mm>28)
			return "Invalid Date";
		else
		    return "Valid Date";
	}
	public static void main(String[] args) {
/*		String d1=checkDate(16,12,2020);
		System.out.println("16/12/2020 is a "+d1);
		
		String d2=checkDate(36,12,2020);
		System.out.println("36/12/2020 is a "+d2);
*/	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date dd/mm/yy : ");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		System.out.println(dd+"/"+mm+"/"+yy+ " is a "+checkDate(dd,mm,yy));
		
		
	}
	

}
