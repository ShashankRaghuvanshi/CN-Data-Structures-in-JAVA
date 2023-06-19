package inheritance_and_Constructors;

public class VehicleUse 
{
	public static void main(String[] args) 
	{	
		Car c = new Car(5,150);               
		//IMPORTANT  when we call child class object automatically parent class object is called be CAREFUL
		// there is super() is in each costructor by default it is invisible but always present
		c.print();
		                    
	}
}
