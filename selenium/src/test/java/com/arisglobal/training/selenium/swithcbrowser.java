package com.arisglobal.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class swithcbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		ChromeDriverManager.getInstance().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> link1=driver.findElements(By.tagName("a"));
		for(WebElement link:link1){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
		driver.close();
		}
	}

