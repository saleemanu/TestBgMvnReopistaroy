package testNGBaseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeSuiteMethods {
	
	
	@BeforeMethod
	public void datasetup()
	{
		System.out.println("datasetup done");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Data teardonw done");
	}
	
}
