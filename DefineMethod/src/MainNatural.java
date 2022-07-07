
public class MainNatural {

	static int sumofNatural(int x) { // called method(formal parameter)
		int sum = 0;
		while (x > 0) {
			sum = sum + x;
			x--;
		}
		return sum;
	}

	public static void main(String[] args) { // calling method
		int s1 = sumofNatural(5); // calling statement(actual parameter)
		System.out.println(s1);

		int s2 = sumofNatural(10); // calling statement(actual parameter)
		System.out.println(s2);

	}
}
