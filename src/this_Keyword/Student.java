package this_Keyword;

public class Student 
{
	String name;
	private int rollNumber;
	
	public Student(String name, int rollNumber)
	{
		System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;                
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void print()
	{
		System.out.println(name + " " + rollNumber);
	}
}
