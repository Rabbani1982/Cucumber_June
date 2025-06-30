package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowtab {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
	}

}
