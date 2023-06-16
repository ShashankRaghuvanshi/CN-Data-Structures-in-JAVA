package final_Keyword;

public class Student 
{
		String name;
		//IMPORTANT final data members can be initialized as soon as they are declared and inside a constructor only  
		//private final int rollNumber;
		private int rollNumber;
		
		public Student(String n, int rn)
		{
			name = n;
			rollNumber = rn;
		}
		
//		public Student(String n)
//		{
//			name = n;
//			rollNumber =100;
//		}
		
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
