package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		Set<String> winid=driver.getWindowHandles();
		System.out.println(winid);
		Iterator<String> swin=winid.iterator();
		String parent=swin.next();
		String child=swin.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
