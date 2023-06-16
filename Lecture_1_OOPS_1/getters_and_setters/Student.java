package getters_and_setters;

public class Student 
{
	String name;
	private int rollNumber;
	
	public int getRollNumber() 
	{
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) 
	{
		if(rollNumber <= 0)
		{
			return;
		}
		this.rollNumber = rollNumber;
	}
	
	
}
