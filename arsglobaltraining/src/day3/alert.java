package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
			driver.switchTo().alert().sendKeys("pramod");
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			//driver.close();
	

}
	}
