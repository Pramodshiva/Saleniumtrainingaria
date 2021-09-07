package arsglobaltrainingass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2assignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[2]/div[1]/span")).click();
		Thread.sleep(5000);
		boolean Display=driver.findElement(By.xpath("//h4[text()='Return on']")).isDisplayed();
		System.out.println("Element displayed is :"+Display);
		driver.close();
	}
}
