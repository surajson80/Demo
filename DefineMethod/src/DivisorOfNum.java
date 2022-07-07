
public class DivisorOfNum {
	static void findDivisor(int x) {
		int i = 1;
		for (i = 1; i < x; i++)
			if (x % i == 0)
					System.out.println(i);

	}

	public static void main(String[] args) {
		System.out.println("Divisor of 6:");
		findDivisor(6);
		System.out.println("-----------------");
		System.out.println("Divisor of 10:");
		findDivisor(10);
		System.out.println("-----------------");
		System.out.println("Divisor of 25:");
		findDivisor(25);
		System.out.println("-----------------");
		System.out.println("Divisor of 625:");
		findDivisor(625);
		System.out.println("-----------------");


	}

}
