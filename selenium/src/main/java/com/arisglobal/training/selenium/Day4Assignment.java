package com.arisglobal.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/");
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='header']/ul[2]/li[1]"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='header']/ul[2]/li[1]/ul/li[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='mainContent']/ul/li/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='mainContent']/ul/li[3]/a")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.close();
}
}