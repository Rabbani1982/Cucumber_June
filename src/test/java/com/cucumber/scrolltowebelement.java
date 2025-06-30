package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltowebelement {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement News= driver.findElement(By.xpath("//strong[text()='News']"));
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;  //upcasting
		 Thread.sleep(5000);
		 js.executeScript("arguments[0].scrollIntoView()", News);
		 
		 System.out.println(js.executeScript("return window.pageYOffset")); 
		 
		

	}

}
