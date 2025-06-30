package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//identify the electronic webelement
 WebElement  electronics   = driver.findElement(By.xpath("//span[text()='Electronics']"));
 
              //move to electronic webelement
             Actions  action=new Actions(driver);
             Thread.sleep(5000);
             action.moveToElement(electronics).build().perform();
             
             //find computer periperials and move to that element
             
       WebElement  CPP =driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
       Thread.sleep(5000);
       action.moveToElement(CPP).click().build().perform();
              
	    
	    
	

	}

}
