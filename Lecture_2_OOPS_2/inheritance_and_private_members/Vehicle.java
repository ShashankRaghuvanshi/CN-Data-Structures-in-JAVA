package inheritance_and_private_members;

public class Vehicle 
{
	String color;
//	int maxSpeed;
	private int maxSpeed;

	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public void print()
	{
		System.out.println("Vehicle Color: "+ color);
		System.out.println("Vehicle Speed: "+ maxSpeed);
	}
}
