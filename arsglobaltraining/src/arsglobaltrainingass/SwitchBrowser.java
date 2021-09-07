package arsglobaltrainingass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		String Browser;
		System.out.println("Enter the Browser to Execute");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
		Browser=s.nextLine();
switch(Browser)
{
case "Chrome":
	System.setProperty("webdriver.chrome.driver","C:\\Browser\\chromedriver1");
	//WebDriverManager.firefoxdriver().setup();
	ChromeDriver driver= new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	driver.get("https://www.linkedin.com/login");
    Thread.sleep(5000);
    String title = driver.getTitle();
    System.out.println(title);
    System.out.println("getting class"+driver.getClass());
    driver.close();	   	
}

	}

}
