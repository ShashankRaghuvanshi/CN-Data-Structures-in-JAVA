package static_Keyword_and_static_Function;

public class StudentUse 
{
	public static void main(String args[])
	{
		Student s1 = new Student("Ankush", 123);
		s1.print();
		
		Student s2 = new Student("Manisha", 125);
		s2.print();
		
		
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
		
		
		//best way to access static variables through class name directly
//		System.out.println(Student.numStudents);
		System.out.println(Student.getNumStudents());
	}
}
