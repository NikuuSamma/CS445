package test;

import bulb.LightBulb;
import static org.junit.Assert.*;
import org.junit.Test;


public class LightBulbTest 
{
	public class LampImplementation extends LightBulb 
	{
		
    }
	
    //test on method
    @Test
    public void testOn() 
    {
        System.out.println("Test on() method: START");
        System.out.println("-------------------------------------------------");
  
        LightBulb lb = new LampImplementation();
        lb.on();
        assertEquals(lb.on,true);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test on() method: END\n");
    }

    //test off method
    @Test
    public void testOff() {
    	System.out.println("Test off() method: START");
    	System.out.println("-------------------------------------------------");
    	
        LightBulb lb = new LampImplementation();
        lb.off();
        assertEquals(lb.on,false);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test off() method: END\n");
    }
}
