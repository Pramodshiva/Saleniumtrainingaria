package DAY5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testngdemo1 {

		
		@BeforeTest(groups={"SmokeTest"})
		public void BrowserStart()
		{
		System.out.println("Browser Started....");	
		}
		
		@AfterTest
		public void AfterTest()
		{
			System.out.println("Browser Closed....");	
		}
		
		

	}