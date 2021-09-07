package arsglobaltrainingass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daytwoassignment2 {

	public static void main(String[] args) throws InterruptedException {
		int Food=10;
		int Clothing=60,Shelter=20,MonthlyPay=500,MonthlyOther=50;
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		System.out.println("Title"+driver.getTitle());
		driver.findElement(By.id("food")).sendKeys(String.valueOf(Food));
		
		driver.findElement(By.id("clothing")).sendKeys(String.valueOf(Clothing));
		Thread.sleep(5000);
		driver.findElement(By.id("shelter")).sendKeys(String.valueOf(Shelter));
		Thread.sleep(5000);
		float vMEXP=Food+Clothing+Shelter;
		System.out.println(vMEXP);
		driver.findElement(By.id("monthlyPay")).sendKeys(String.valueOf(MonthlyPay));
		Thread.sleep(5000);
		driver.findElement(By.id("monthlyOther")).sendKeys(String.valueOf(MonthlyOther));
		Thread.sleep(5000);
		float vMInc=MonthlyPay+MonthlyOther;
		System.out.println(vMInc);
		String monthyexp=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String monthysav=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		float monthyexp1=Float.parseFloat(monthyexp);
		float monthysav1=Float.parseFloat(monthysav);
		if(monthyexp1==vMEXP){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		if(monthysav1==vMInc){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		driver.close();
		

	}

	}


