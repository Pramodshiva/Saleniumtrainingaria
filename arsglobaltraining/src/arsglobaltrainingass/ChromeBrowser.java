package arsglobaltrainingass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void chrome()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
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
