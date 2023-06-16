package getters_and_setters;

public class StudentUse 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name = "Ankur";
		s1.setRollNumber(120);
		
		System.out.println(s1.name);
		System.out.println(s1.getRollNumber());
		
		
		Student s2 = new Student();
		s2.name = "Manisha";
		s2.setRollNumber(121);
		
		System.out.println(s2.name);
		System.out.println(s2.getRollNumber());

	}

}
