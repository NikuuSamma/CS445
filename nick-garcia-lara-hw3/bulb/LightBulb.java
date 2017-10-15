package bulb;
import implementation.LampImplementation;

public abstract class LightBulb implements LampImplementation
{
	public boolean on;
	
    public LightBulb()
    {
    	
    }
    
    public LightBulb(boolean onOff)
    {
    	if(onOff == true)
    	{
    		on();
    	}
    	else 
    	{
    		off();
    	}
    }

	public void on()
    {
		
    	on = true;
        System.out.println("Lightbulb is on.");
    }
    
    public void off()
    {
    	on = false; 
        System.out.println("Lightbulb is off.");
    }
}