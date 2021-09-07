package arsglobaltraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.drive","C:\\Browser\\chromedriver1.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.linkedin.com/login");
     Thread.sleep(5000);
     driver.close();
     
     
	}

}		
