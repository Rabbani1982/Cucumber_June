package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        // driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
        
       WebElement  searchbox= driver.findElement(By.name("q"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(5000);
        js.executeScript("arguments[0].setAttribute('value','laptops')", searchbox);
	}

}
