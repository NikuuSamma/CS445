package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import homework.Bat;
//import homework.TestCreature;
import homework.Thing;
import homework.Tiger;

public class BatTest {

	private ByteArrayOutputStream println = new ByteArrayOutputStream();
	private PrintStream oldSystemOut = System.out;
	
	@Before
	public void setUpStreams()
	{
	    // capture System.out.println
	    System.setOut(new PrintStream(println));
	}

	@After
	public void cleanUpStreams()
	{
	    System.setOut(oldSystemOut);
	}
	
	@Test
	public void testMove() 
	{
		Bat testBat = new Bat("testBat");
		testBat.move();
		assertEquals(testBat.toString() + " is swooping through the dark.\n",println.toString());
	}
	
	@Test
	public void testFly() 
	{
		Bat testBat = new Bat("testBat");
		testBat.fly();
		assertEquals(testBat.toString() + " is swooping through the dark.\n",println.toString());
	}
	
	@Test
	public void testEat()
	{
		Thing[] testThings = new Thing[2];
		Tiger testTiger = new Tiger("Tiger");
		Thing testThing = new Thing("Apple");
		testThings[0] = testTiger;
		testThings[1]= testThing;
		Bat testBat = new Bat("testBat");
		testBat.eat(testThings[0]);
		assertEquals(testBat.eaten,true);
	}
	
	@Test
	public void testWontEat()
	{
		Thing[] testThings = new Thing[2];
		Tiger testTiger = new Tiger("Tiger");
		Thing testThing = new Thing("Apple");
		testThings[0] = testTiger;
		testThings[1]= testThing;
		Bat testBat = new Bat("testBat");
		testBat.eat(testThings[1]);
		assertEquals(testBat.eaten,false);
	}
	
	@Test
	public void testWontEatSilent()
	{
		Thing[] testThings = new Thing[2];
		Tiger testTiger = new Tiger("Tiger");
		Thing testThing = new Thing("Apple");
		//TestCreature testCreature = new TestCreature();
		testThings[0] = testThing;
		testThings[1]= testTiger;
		//Bat testBat = new Bat("testBat");
		//testBat.eat(testCreature);
		assertEquals("...\n",println.toString());
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Thing[] testThings = new Thing[1];
		Bat testBat = new Bat("testBat");
		Tiger testTiger = new Tiger("Henry");
		testThings[0] = testTiger;
		testBat.eat(testThings[0]);
		testBat.whatDidYouEat();
		assertEquals(testBat.ate,testTiger.toString());	
	}
}
