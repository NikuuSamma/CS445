package homework;

public abstract class Creature extends Thing
{
	String creatureName;
	public boolean eaten = false;
	public String ate;
	
	public Creature()
	{
		super();
		this.creatureName = "Creature";
	}
	
	public Creature(String name)
	{
		super(name);
		this.creatureName = name;
	}
	
	public void eat(Thing aThing)
	{
		System.out.println(this.creatureName + " has just eaten " + aThing.thingName);
		eaten = true;
		ate = aThing.thingName;
	}
	
	public void whatDidYouEat()
	{
		if(eaten == false)
		{
			System.out.println(this.creatureName + " has had nothing to eat!");
		}
		else if(eaten == true)
		{
			System.out.println(this.creatureName + " has eaten " + ate);
		}
	}
	
	public abstract void move();
	
}
