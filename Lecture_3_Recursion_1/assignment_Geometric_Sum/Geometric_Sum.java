package assignment_Geometric_Sum;

import java.util.Scanner;

public class Geometric_Sum 
{
	public static double geometricSum(double n)
	{
		if(n == 0)
		{
			return 1;
		}
		return geometricSum(n-1) + 1/(Math.pow(2, n));
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double ans = geometricSum(n);
		System.out.println(ans);

	}

}
