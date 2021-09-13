package DAY5;

import org.testng.annotations.Test;

public class TestDemo3 
{
@Test(groups = {"SmokeTest"},dependsOnMethods= "Testngdemo1.BrowserStart",alwaysRun = true)
public void sinout()
{
	System.out.println("singout");
}
}
