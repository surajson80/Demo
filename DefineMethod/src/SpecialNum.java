
public class SpecialNum {
	static boolean checkNum(int i)
	{
		int x=i/10;
		int y=i%10;
		int z=x+y+x*y;
		if(z==i)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
/*		boolean s1=checkNum(39);
		System.out.println(s1);
		
		boolean s2=checkNum(15);
		System.out.println(s2);
*/		
		
		boolean s=checkNum(35);
		if(s==true)
			System.out.println("35 is a special 2 digit number");
		else
			System.out.println("35 is not special 2 digit number");

		
	}

}
