package first_Index_of_Number;

import java.util.Scanner;

public class First_Index_of_Number 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i=0; i<n; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static int firstIndex(int input[], int x, int startIndex)
	{
		if(startIndex == input.length)
		{
			return -1;
		}
		if(input[startIndex] == x)
		{
			return startIndex;
		}
		int index = firstIndex( input, x, startIndex + 1);
		return index;
	}
	
	public static int firstIndex(int input[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return firstIndex( input, x, 0);
	}
	
	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		System.out.println(firstIndex(arr));

	}

}
