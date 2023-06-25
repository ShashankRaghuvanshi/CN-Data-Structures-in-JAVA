package check_if_Array_is_Sorted_Better;

public class Check_Array_is_Sorted 
{
	//This fucntion checks if the array is sorted from startIndex to end
	public static boolean checkSortedBetter(int input[], int startIndex)
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
	
	public static void main(String []args)
	{
		int input[] = {1,2,3,4,5,6};
		System.out.println(checkSortedBetter(input, 0));
	}
}
