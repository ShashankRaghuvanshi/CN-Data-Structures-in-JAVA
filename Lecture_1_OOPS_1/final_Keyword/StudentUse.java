package final_Keyword;
import java.util.Scanner;

public class StudentUse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student s2 = new Student("Manisha", 121);
		
		Student s1 = new Student("Ankush", 123);
		
		s1.print();
		s2.print();
	}
}
