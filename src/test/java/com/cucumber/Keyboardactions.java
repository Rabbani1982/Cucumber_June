package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		//identify first textbox		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		
		Actions  action=new Actions(driver);
		
		//SELECT THE TEXT  - CTRL +A
	    action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    
	    //COPY THE TEXT - CTRL + C	    
	    action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    //move to 2nd text box	    
	    action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
	    
	    //PAST THE COPIED TEXT  -  CTRL + V	    
	    action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    
	    //CTRL + SHIFT + A
	    
 action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL)
	       .build().perform() ;
	
		
		
		
		
		
	}

}
