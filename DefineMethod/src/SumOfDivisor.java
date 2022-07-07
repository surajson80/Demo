
public class SumOfDivisor {
	static void sumDivisor(int x) {
		int sum = 0;
		int i=1;
		for (i = 1; i < x; i++)
			if (x % i == 0)
				{
				sum=sum+i;
				System.out.println(i);
				}
		System.out.println("Sum of divisor: "+sum);

	}
	public static void main(String[] args) {
		System.out.println("Divisor of 6:");
		sumDivisor(6);
	}

}
