package last_Index_of_Number;

import java.util.Scanner;

public class Last_Index_of_Number 
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
	
	public static int lastIndex(int input[], int x, int lastIndex)
	{
		if(lastIndex < 0)
		{
			return -1;
		}
		if(input[lastIndex] == x)
		{
			return lastIndex;
		}
		int index = lastIndex( input, x, lastIndex - 1);
		return index;
	}
	
	public static int lastIndex(int input[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return lastIndex( input, x, input.length - 1);
	}
	
	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		System.out.println(lastIndex(arr));

	}
}
