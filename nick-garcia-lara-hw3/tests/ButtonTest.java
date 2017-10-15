package tests;

import buttons.Button;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ButtonTest 
{
	//test turning the swtich on
    @Test
    public void testSwitchOn()
    {
        System.out.println("Test switchOn() method: START");
        System.out.println("-------------------------------------------------");
       
        Button b = new Button(false);
        b.switchOn();
        assertEquals(b.on,true);
       
        System.out.println("-------------------------------------------------");
        System.out.println("Test switchOn() method: End\n" );
    }

   //test turning the switch off
    @Test
    public void testSwitchOff() 
    {
        System.out.println("Test switchOff() method: START");
        System.out.println("-------------------------------------------------");
       
        Button b = new Button(true);
        b.switchOff();
        assertEquals(b.on,false);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test switchOff() method: END\n");
    }
    
    //Test to apply on() method from the lightbulb class to button class
    @Test
    public void testLightOn() 
    {
        System.out.println("Test on() method from lightbulb class in the Button class: START");
        System.out.println("-------------------------------------------------");
       
        Button b = new Button(false);
        b.on();
        assertEquals(b.on,true);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test on() method from lightbulb class in the button lass: END\n");
    }
    
   //Test to apply off() method from Lightbulb class to button class
    @Test
    public void testLightOff() 
    {
        System.out.println("Test off() method from LightBulb class in the Button class: START");
        System.out.println("-------------------------------------------------");
       
        Button b = new Button(true);
        b.off();
        assertEquals(b.on,false);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test off() methd from LightBulb class in the Button class: END\n");
    }
    
     //Test for switch on when switch is already set to on
    @Test
    public void testDoubleOn() 
    {
        System.out.println("Test switchOn() method when the switch is already set to on: START");
        System.out.println("-------------------------------------------------");
        
        Button b = new Button();
        b.switchOn();
        b.switchOn();
        assertEquals(b.on2,"Lightbulb is already on");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test switchOn() method when the switch is already set to on: END\n");
    }
    
    //Test for switch off when switch is already set to off
    @Test
    public void testDoubleOff() 
    {
    	System.out.println("Test switchOff() method when the switch is already set to off: START");
    	System.out.println("-------------------------------------------------");
        
    	Button b = new Button(true);
        b.switchOff();
        b.switchOff();
        assertEquals(b.off2,"Lightbulb is already off");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Test switchOff() method when the switch is already set to off: END\n");
    }
    
}

