
public class FibonacciNumber {
	static void checkSeries(int n)
	{
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<n;i++)
		{
			 num3 = num1+num2;
			 System.out.println(num3);
			 num1=num2;
			 num2=num3;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Fibonacci Series:");
		checkSeries(10);
	}

}
