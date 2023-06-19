package super_Keyword;

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
