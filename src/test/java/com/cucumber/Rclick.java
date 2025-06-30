package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rclick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//identify the web element		
       WebElement  button  = driver.findElement(By.xpath("//span[text()='right click me']"));
       Thread.sleep(5000);
       Actions action=new Actions(driver);
       Thread.sleep(5000);
       action.contextClick(button).build().perform();
       
		
		
		

	}

}
