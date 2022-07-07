
public class BiggestNum {
	
	static double findNum(double x,double y,double z)
	{
		double res=0;
		if(x>y&&x>z)
		{
			res=res+x;
		}
		else if(y>z)
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
		double b1=findNum(45.06,78.12,100.60);
		System.out.println(b1);
		
		double b2=findNum(45.0,8.12,10.60);
		System.out.println(b2);	
	}

}
