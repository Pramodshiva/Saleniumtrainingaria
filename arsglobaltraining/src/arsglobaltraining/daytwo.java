package arsglobaltraining;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class daytwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		System.out.println("Title"+driver.getTitle());
		driver.findElement(By.id("food")).sendKeys("10");
		driver.findElement(By.id("clothing")).sendKeys("60");
		driver.findElement(By.id("shelter")).sendKeys("20");
		driver.findElement(By.id("monthlyPay")).sendKeys("500");
		driver.findElement(By.id("monthlyOther")).sendKeys("50");
		String monthyexp=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String monthysav=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println(monthyexp);
		System.out.println(monthysav);
		driver.close();
		

	}

}
