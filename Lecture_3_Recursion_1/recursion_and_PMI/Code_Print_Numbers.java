package recursion_and_PMI;
import java.util.Scanner;

public class Code_Print_Numbers 
{
	public static void printNumber(int n)
	{
		if(n == 0)
		{
			return;
		}
		printNumber(n-1);
		System.out.println(n);
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumber(n);
	}
}
