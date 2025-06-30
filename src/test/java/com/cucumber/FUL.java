package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FUL {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		Thread.sleep(5000);
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\Dell\\Documents\\Textfile1.txt");
		
		

	}

}
