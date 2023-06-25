package check_if_Array_is_Sorted;

import java.util.Scanner;

public class CheckSortedArray 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static boolean checkSorted(int [] array)
	{
		if(array.length <= 1)
		{
			return true;
		}
		
		int smallArray[] = new int[array.length - 1];
		for(int i=1; i<array.length; i++)
		{
			smallArray[i-1] = array[i];
		}
		
		boolean smallAns = checkSorted(smallArray);
		if(!smallAns)
		{
			return false;
		}
		if(array[0] <= array[1])
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkSorted_2(int [] array)
	{
		if(array.length <= 1)
		{
			return true;
		}
		if(array[0] > array[1])
		{
			return false;
		}
		
		int smallArray[] = new int[array.length - 1];
		for(int i=1; i<array.length; i++)
		{
			smallArray[i-1] = array[i];
		}
		
		boolean smallAns = checkSorted_2(smallArray);
		return smallAns;
		
	}

	
	public static void main(String []args)
	{
		int array[] = takeInput();
		boolean ans = checkSorted(array);
		System.out.println(ans);
		
		boolean ans2 = checkSorted_2(array);
		System.out.println(ans2);
		
	}
}	

//1 Base Case
//2 (n-1)/ smaller problem solution
//3 update/processing
//order of 2, 3 can be different