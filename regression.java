package RegTest;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class regression {

	@BeforeTest
	public void prerequisite()
	{
		System.out.println("---Pre-req to be completed---");
	}
	
	@Test(priority=2)
	public void doRegression()
	{
		//throw new SkipException("Any reason");
		System.out.println("***Test Success***");
	 }

	@Test(priority=1)
	public void CompleteRegression()
	{
	System.out.println("^^Test complete^^^");
	}

	@AfterTest
	public void closure()
	{
		System.out.println("$$$Close Testing$$$");
	}
}
