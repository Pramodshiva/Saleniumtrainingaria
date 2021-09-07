package arsglobaltrainingass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChangeBrowser {

public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String browser;
		System.out.println("Choose the browser betwwen chrome and edge");
		browser=s.nextLine();
		if(browser.equals("chrome")){
			System.out.println("Opening Chrome Browser");
			chrome();
		}
		
		else if(browser.equals("edge")){
			System.out.println("Opening Edge Browser");
			edge();
		}
		else
			System.out.println("Invalid Input please Enter Available  Browser");
	}
	public static void chrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		action(driver);
   	   	
	}
	public static void edge()
	{
		System.setProperty("webdriver.edge.driver","C:\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		action(driver);
	}
	public static void action(WebDriver driver){
		driver.get("https://www.linkedin.com/login");
		try {
			Thread.sleep(5000);
			} 
		catch (InterruptedException e) {
			e.printStackTrace();
			}
	    String title = driver.getTitle();
	    if(title.equals("LinkedIn"));
	    System.out.println(title);
	    System.out.println("getting class"+driver.getClass());
	    driver.close();
	}
}
	
