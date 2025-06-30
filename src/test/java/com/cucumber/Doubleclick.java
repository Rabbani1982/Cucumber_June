package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
       driver.manage().window().maximize();
       
       driver.switchTo().frame("iframeResult");
       
            WebElement  field1  = driver.findElement(By.xpath("//*[@id='field1']"));
            WebElement  field2  = driver.findElement(By.xpath("//input[@id='field2']"));            
          WebElement  copybtn   = driver.findElement(By.xpath("//button[text()='Copy Text']"));
          //Thread.sleep(5000);
          //switch to frame
                 
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          //remove the text from field1
             field1.clear();
             
             //enter text into field1
             field1.sendKeys("J SRINATH");
              
             //perform double click operation on copybtn
             
               Actions action=new Actions(driver);
               action.doubleClick(copybtn).build().perform();
       
       


	}

}
