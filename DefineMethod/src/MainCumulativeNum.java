import java.util.Scanner;

public class MainCumulativeNum {
	static int printCumulative(int x)
	{
		int sum=0;
		for(int i=1;i<=x;i++)
			sum=sum+i;
		return sum;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int r=sc.nextInt();
		sc.close();
		
		System.out.println("Ranges are: "+ printCumulative(r));
	}

}
