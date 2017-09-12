package homework;

public class Ant extends Creature
{
	public String antName;

	public Ant()
	{
		super();
		this.antName = "Ant"; 
	}

	public Ant(String name)
	{
		super(name);
		this.antName = name;
	}
	
	public void move()
	{	
		System.out.println(antName.toString() + " " + getClass().getSimpleName() + " is crawling around.");
	}
}
