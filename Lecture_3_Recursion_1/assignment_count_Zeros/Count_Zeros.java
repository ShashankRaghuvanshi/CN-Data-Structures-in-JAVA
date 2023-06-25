package assignment_count_Zeros;

import java.util.Scanner;

public class Count_Zeros 
{
	public static int countZeros(int n)
	{
		int count=0;
		if((n > 0) && (n%10 == 0))
		{
			count++;
		}
		if( n == 0)
		{
			return 0;
		}
		return countZeros(n/10) + count;
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = countZeros(n);
		System.out.println(ans);
	}
}
