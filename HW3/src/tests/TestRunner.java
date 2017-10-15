package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner 
{
	public static void main(String [] args)
	{
		Result result = JUnitCore.runClasses(ButtonTest.class, LightBulbTest.class,PushDownButtonTest.class);
		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
