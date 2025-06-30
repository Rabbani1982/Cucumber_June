package com.cucumber;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltillend 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//scroll till end of the page
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;  //upcasting
		 Thread.sleep(5000);
		 
		 js.executeScript("document.body.style.zoom='50'");
		 
		 
//		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 
//		 
//		 System.out.println(js.executeScript("return window.pageYOffset")); 
//		 
//		 Thread.sleep(5000);
//		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


	}

}
