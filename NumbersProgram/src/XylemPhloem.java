import java.util.Scanner;

public class XylemPhloem {
	
	static String check(int x)//643528
	{
		int ms=0;
		int os=x%10;
		x=x/10;
		while(x>9)
		{
			int r=x%10;
			ms=ms+r;
			x=x/10;
		}
		os=os+x;
		if(os==ms)
			return "Xylem";
		else
			return "Phloem";
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		String xp=check(n);
		System.out.println("Entered Number is: "+xp);
	}
}
