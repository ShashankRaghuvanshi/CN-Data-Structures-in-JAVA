package protected_and_super_keyword;

public class VehicleUse 
{
	public static void main(String[] args) 
	{	
		Vehicle v = new Vehicle();
		v.setMaxSpeed(50);
		v.color = "green";
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.isConvertible = true;
		c.print();                        //important it will inherit parent property not value 
		c.printMaxSpeed();
	}
}

//private and protected access modifier are not allowed in front of class