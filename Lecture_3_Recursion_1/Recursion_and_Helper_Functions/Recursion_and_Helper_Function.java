package Recursion_and_Helper_Functions;

public class Recursion_and_Helper_Function 
{
	private static boolean checkSortedBetter(int input[], int startIndex)
	{
		if(startIndex >= input.length - 1)
		{
			return true;
		}
		
		if(input[startIndex] > input[startIndex + 1])
		{
			return false;
		}
		
		boolean smallAns = checkSortedBetter(input, startIndex + 1);
		return smallAns;
	}
	
	public static boolean checkSortedBetter(int input[])           //function overloading
	{
		return checkSortedBetter(input, 0);
	}
	
	public static void main(String []args)
	{
		int input[] = {1,2,3,4,5,6};
		System.out.println(checkSortedBetter(input));
	}
}
