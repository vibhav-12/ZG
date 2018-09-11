package com.wc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BaseTest {
	 public static WebDriver driver;
	  static DesiredCapabilities capabilities=null;
	  public static String SerialNo;
	  public static String PostName;
	  public static String AdvertisementDetails;
	  public static String Online_Apply;
	  public static String LastDate;
	  public static String Address;
	  
	  
	  
	
	//public static void main(String[] args) throws InterruptedException {
		@Test
		public void display() throws InterruptedException
		{
	    System.out.println("*************************Scenario Started********************************************************************************************************************************************************************************************************************************************");
    	System.out.println("Called openBrowser");
    	
    	
    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");
    	System.out.println("Debug 1");
    	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
    	System.out.println("Debug 2");
    	capabilities.setCapability("marionette", true);
    	System.out.println("Debug 3");
        FirefoxBinary binary = new FirefoxBinary();
    	
    	FirefoxOptions firefoxOptions = new FirefoxOptions(capabilities);
    	firefoxOptions.setBinary(binary);
    	firefoxOptions.addArguments("--display=9999");
    	new FirefoxDriver(firefoxOptions);
    	
    	//WebDriver driver = new FirefoxDriver(capabilities);
    	System.out.println("Debug 4");
    	driver.get("https://test.doccons24.de/login");
		driver.findElement(By.xpath("//input[@placeholder='Please enter a email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Please enter a email']")).sendKeys("Vibhav@doccons24.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter a password')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter a password')]")).sendKeys("TEST#Password20");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Patient1");
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("PLast");
		WebElement selectPatient=driver.findElement(By.xpath("//select[@id='exampleSelect1']"));
		Select select=new Select(selectPatient);
		select.selectByVisibleText("Patient");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Hans#wurst20");
		driver.findElement(By.xpath("//input[@id='inputCPassword']")).sendKeys("Hans#wurst20");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter a email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Please enter a email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter a password')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter a password')]")).sendKeys("Hans#wurst20");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
		
		driver.quit();
    
    	
    	
    	
        
       
	
}
}
