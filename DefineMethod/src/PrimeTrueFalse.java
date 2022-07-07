
public class PrimeTrueFalse {
	static boolean checkNum(int n)
	{
		for (int i = 2; i < n; i++) 
		{
			if (n % i == 0) 
			{
				return false;
			}
		}
		if (n == 0 || n == 1) 
		{
			return false;
		} 
		else
			return true;		
	}

	public static void main(String[] args) {
		boolean s=checkNum(25);
		System.out.println(s);
		
	}

}
