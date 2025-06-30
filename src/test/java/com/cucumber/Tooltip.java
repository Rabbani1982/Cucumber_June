package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");	
       driver.manage().window().maximize();
       
       WebElement  cart=driver.findElement(By.xpath("//a[text()='Cart']"));
       
         Actions action=new Actions(driver);
         action.moveToElement(cart).build().perform();
         
                  String    tooltip=cart.getText();
                  
                     System.out.println(tooltip);
         
        
       

	}

}
