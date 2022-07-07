
public class MonthDay {
	static int totalDays(int x)
	{
		int day=0;
		if(x==1||x==3||x==5||x==7||x==8||x==10||x==12)
			day=31;
		else if(x==4||x==6||x==9||x==11)
			day=30;
		else if(x==2)
			day=28;
		return day;
	}
	public static void main(String[] args) {
		int m1=totalDays(5);
		System.out.println(m1);
	}

}
