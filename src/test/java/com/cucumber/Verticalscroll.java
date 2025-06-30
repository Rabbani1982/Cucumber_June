package com.cucumber;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verticalscroll {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
	 JavascriptExecutor js=(JavascriptExecutor)driver;  //upcasting
	 Thread.sleep(5000);
	 js.executeScript("window.scrollBy(0,1000)", "");
	 
	System.out.println(js.executeScript("return window.pageYOffset")); 
	 
	 
	 
	 
		
		
		
		;

	}

}
