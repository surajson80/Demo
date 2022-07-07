import java.util.Scanner;

public class AsendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
/*		int max=(a>b)?a:b;
		max=(max>c)?max:c;
		
		int min=(a<b)?a:b;
		min=(min<c)?min:c;
		
		int mid=(a+b+c)-(max+min);
		System.out.println(min+" "+mid+" "+max);
		
*/		
		
		if(a>b&&a>c)
		{
			if(b>c) 
				System.out.println(c+" "+b+" "+a);//a>b>c
			else
				System.out.println(b+" "+c+" "+a);//a>c>b
		}
		else if(b>c)
		{
			if(a>c)
				System.out.println(c+" "+a+" "+b);//b>a>c
			else
				System.out.println(a+" "+c+" "+b);//b>c>a
		}
		else
		{
			if(a>b)
				System.out.println(b+" "+a+" "+c);//c>a>b
			else
				System.out.println(a+" "+b+" "+c);//c>b>a
		}
					
	}

}
