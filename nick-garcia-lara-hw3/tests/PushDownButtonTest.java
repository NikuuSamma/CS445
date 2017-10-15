package tests;

import buttons.PushDownButton;
import bulb.LightBulb;
import org.junit.Test;
import static org.junit.Assert.*;

public class PushDownButtonTest 
{   
	public class LampImplementation extends LightBulb 
	{
		
    }
	
   //test pushButton() method when light is off
    @Test
    public void testPushButtonLightOn() 
    {
        System.out.println("Test pushButton() while lightbulb is on: START");
        System.out.println("-------------------------------------------------");
       
        PushDownButton pb = new PushDownButton(true);
        pb.pushButton();
        assertEquals(pb.on,false);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test pushButton() while lightbulb is on: END\n");
    }
    
    //test pushButton method when light is on
    @Test
    public void testPushButtonLightOff() 
    {
    	System.out.println("Test pushButton() while lightbulb is off: START");
    	System.out.println("-------------------------------------------------");

    	PushDownButton pb = new PushDownButton(false);
    	pb.pushButton();
    	assertEquals(pb.on,true); 
    	
    	System.out.println("-------------------------------------------------");
        System.out.println("Test pushButton() while lightbulb is off: END\n");
    }    
}