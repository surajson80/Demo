
public class Factorial {
	static int getFact(int x) {
		int fact = 1;
		while (x > 1) {
			fact = fact * x;
			x--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int f1 = getFact(5);
		System.out.println(f1);

		int f2=getFact(14);
		System.out.println(f2);
		
	}

}
