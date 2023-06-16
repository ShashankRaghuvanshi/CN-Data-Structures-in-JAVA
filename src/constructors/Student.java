package constructors;

public class Student 
{
	String name;
	private int rollNumber;
	
	//Default Constructor
//	public Student()
//	{
//		
//	}
	
	//Custom Constructor
	public Student(String n, int rn)
	{
		name = n;
		rollNumber = rn;
	}
	
//	public Student()
//	{
//		rollNumber = 100;
//	}
	
	public Student(String n)
	{
		name = n;
	}
	
	public int getRollNumber() 
	{
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) 
	{
		if(rollNumber < 0)
		{
			return;
		}
		this.rollNumber = rollNumber;
	}
	
	//print function
	public void print()
	{
		System.out.println(name + " " + rollNumber);
	}
	
}
