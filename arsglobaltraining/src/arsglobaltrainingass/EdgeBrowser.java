package arsglobaltrainingass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser 
{
	public static void edge()
	{
	System.setProperty("webdriver.edge.driver","C:\\Browser\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.linkedin.com/login");
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    String title = driver.getTitle();
    System.out.println(title);
    System.out.println("getting class"+driver.getClass());
    driver.close();	   	
}
}