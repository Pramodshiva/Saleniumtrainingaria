package arsglobaltrainingass;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dattwoassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(("selenium"),Keys.ENTER);
		Thread.sleep(5000);
		String value=driver.findElement(By.xpath("//input[@value='selenium'and @aria-label='Search']")).getAttribute("value");
		if(value.equals("selenium"));
		System.out.println(value);
		String time=driver.findElement(By.xpath("//div[@id='result-stats']/nobr")).getText();
		System.out.println(time);
		driver.close();

	}
	
}
