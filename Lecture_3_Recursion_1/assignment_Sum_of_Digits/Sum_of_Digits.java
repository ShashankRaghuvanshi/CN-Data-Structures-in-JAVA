package assignment_Sum_of_Digits;

import java.util.Scanner;

public class Sum_of_Digits 
{
	public static int sumDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return (n%10) + sumDigits(n/10);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sumDigits(n);
		System.out.println(ans);

	}

}
