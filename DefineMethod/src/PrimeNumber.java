
public class PrimeNumber {

	static String checkNum(int n) 
	{
		for (int i = 2; i < n; i++) 
		{
			if (n % i == 0) 
			{
				return "Not a Prime Number";
			}
		}
		if (n == 0 || n == 1) 
		{
			return "Not a Prime Number";
		} 
		else
			return "Prime Number";

	}

	public static void main(String[] args) {
		String a = checkNum(12);
		System.out.println(a);
	}

}
