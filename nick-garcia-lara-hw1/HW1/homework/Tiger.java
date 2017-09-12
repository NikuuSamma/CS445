package homework;

public class Tiger extends Creature 
{
	public String tigerName;
	
	public Tiger()
	{
		super();
		this.tigerName = "Tiger"; 
	}
	
	public Tiger(String name)
	{
		super(name);
		this.tigerName = name;
	}
	public void move()
	{
		System.out.println(tigerName.toString() + " " + getClass().getSimpleName() + " has just pounced.");
	}
}