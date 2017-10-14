package buttons;
import bulb.LightBulb;

public class PushDownButton extends LightBulb 
{
    
    public PushDownButton()
    {
        super();
    }
    
    public PushDownButton(boolean onOff)
    {
        super(onOff);
    }
    
    public void pushButton()
    {
        if (on == true)
        {
            System.out.println("Button set to off.");
            off();
            on = false;
        }
        else
        {
            System.out.println("Button set to on.");
            on();
            on = true;
        }
    }
}
