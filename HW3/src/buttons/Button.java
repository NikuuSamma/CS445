package buttons;
import bulb.LightBulb;

public class Button extends LightBulb
{
	public String on2 = "Lightbulb is already on";
	public String off2 = "Lightbulb is already off";
	
    public Button()
    {
        super();
    }
    
    public Button(boolean onOff)
    {
        super(onOff);
    }
    
    public void switchOn()
    { 	
    	if (on == true)
    	{
    		System.out.println(on2);
    	}
    	else
    	{
	        System.out.println("Button switched to on.");
	        on();
    	}
    }
    
    public void switchOff()
    {
    	if (on == false)
    	{
    		System.out.println(off2);
    	}
    	else
    	{
    		System.out.println("Button switched to off.");
            off();
    	}
    }
}
