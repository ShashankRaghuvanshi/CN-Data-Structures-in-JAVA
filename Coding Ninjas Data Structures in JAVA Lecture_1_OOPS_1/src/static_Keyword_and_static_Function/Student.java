package static_Keyword_and_static_Function;

public class Student 
{
	String name;
	private final int rollNumber;
	
//	static int numStudents;
	private static int numStudents;
	
	public static int getNumStudents()
	{
		return numStudents;
	}
	
	public Student(String name, int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber; 
		numStudents++;
	}
	
	public int getRollNumber() 
	{
		return rollNumber;
	}
	
	public void print()
	{
		System.out.println(name + " " + rollNumber);
	}
}

//static functions cannot use non-static variables
//static functions cannot call non-static functions
//this or super keywords cannot be used inside a static function
//static keyword is bound to the class and not to an individual object, thus we can't make constructors static 
