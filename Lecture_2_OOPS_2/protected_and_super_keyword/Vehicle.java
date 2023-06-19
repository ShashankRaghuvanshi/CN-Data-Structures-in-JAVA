package protected_and_super_keyword;

public class Vehicle 
{
	protected String color;
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
		System.out.println("Vehicle Speed: "+ getMaxSpeed());
	}
}
