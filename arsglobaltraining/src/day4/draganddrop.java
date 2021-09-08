package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement mdrag=driver.findElement(By.id("draggable"));
		WebElement mdrop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(mdrag, mdrop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
		driver.close();
	}

}
