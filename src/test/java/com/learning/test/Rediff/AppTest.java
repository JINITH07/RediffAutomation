package com.learning.test.Rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
  
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
    public void AppTestdriver( )
    {
		driver.get("https://www.rediff.com");

    }

	@org.testng.annotations.Test
    public void suite()
    {
       WebElement money=driver.findElement(By.className("linkcolor"));
  
       money.click();
    }

	@AfterTest
    public void testApp()
    {
      // driver.quit();
    }
}
