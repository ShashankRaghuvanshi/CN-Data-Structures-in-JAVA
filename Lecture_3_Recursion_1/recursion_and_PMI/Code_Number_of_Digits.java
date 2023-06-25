package recursion_and_PMI;
import java.util.Scanner;

public class Code_Number_of_Digits 
{
	public static int numberOfDigits(int n)
	{
		if( n == 0)
		{
			return 0;
		}
		
		int count = numberOfDigits(n/10);
		return ++count;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = numberOfDigits(n);
		System.out.println(ans);

	}

}
