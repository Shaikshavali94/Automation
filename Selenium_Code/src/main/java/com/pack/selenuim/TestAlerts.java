package com.pack.selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Alert Box
		
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Confirm Box
	//	driver.findElement(By.id("confirmBox")).click();
	//	System.out.println(driver.switchTo().alert().getText());
	//	driver.switchTo().alert().accept();
	//	System.out.println(driver.findElement(By.id("output")).getText());
	//	driver.findElement(By.id("confirmBox")).click();
	//	System.out.println(driver.switchTo().alert().getText());
	//	driver.switchTo().alert().dismiss();
	//	System.out.println(driver.findElement(By.id("output")).getText());
		
		//Prompt Box
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Shaikshavali");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
