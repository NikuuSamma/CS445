package homework;

public class Thing extends Object
{
	public String thingName;
	
	public Thing()
	{
		this.thingName = "Thing"; 
	}
	
	public Thing(String name)
	{
	 this.thingName = name;
	}

	public String toString()
	{
		 String className = getClass().getSimpleName();
		 
		if(className.equals("Thing"))
		{
			return thingName;
		}
		else
		{
			 return thingName + " " + className;
		}
	}
}
