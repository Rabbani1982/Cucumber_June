package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	 static public final  void main(String a) throws InterruptedException 
	{
		   WebDriver driver = new ChromeDriver();
	       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	       driver.manage().window().maximize();
	       
	    WebElement  sourceele=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
	   WebElement targetele = driver.findElement(By.xpath("//div[text()='United States']"));
	   
	      Actions action=new Actions(driver);
	      Thread.sleep(5000);
	      action.dragAndDrop(sourceele, targetele).build().perform();
	       

	}

}
