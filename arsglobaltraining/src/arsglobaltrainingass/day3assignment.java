package arsglobaltrainingass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3assignment {

	private static Object String;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> link1=driver.findElements(By.tagName("a"));
		for(WebElement link:link1){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		
		driver.close();
		}
	}
	}
