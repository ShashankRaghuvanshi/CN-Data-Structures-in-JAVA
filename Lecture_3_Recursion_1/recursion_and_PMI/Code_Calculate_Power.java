package recursion_and_PMI;
import java.util.Scanner;

public class Code_Calculate_Power 
{
	public static int calculatePower(int x, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return x * calculatePower(x,n-1);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans = calculatePower(x,n);
		System.out.println(ans);

	}

}
