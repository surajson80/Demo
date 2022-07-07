
public class SmallestNum {
	static double findNum(double x,double y,double z)
	{
		double res=0;
		if(x<y&&x<z)
		{
			res=res+x;
		}
		else if(y<z)
		{
			res=res+y;
		}
		else
		{
			res=res+z;
		}		
		return res;
	}
	public static void main(String[] args) {
		double s1=findNum(4.06,8.12,10.60);
		System.out.println(s1);
		
		double s2=findNum(405.0,80.12,100.60);
		System.out.println(s2);
	}

}
