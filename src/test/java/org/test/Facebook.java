package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static WebDriver dr;
	
	
	
	@BeforeClass
	public void beforeClass() {
		
System.out.println("before class");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sasi\\eclipse-workspace\\Seleniumproject\\Drivers\\chromedriver.exe");
dr =new ChromeDriver();
dr.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		dr.quit();

	}
	
	@Before
	public  void before() {
	System.out.println("before");
	Date d = new Date() ;
System.out.println("test starts....." + d);
} 
	
	@After
	public void after() {
		System.out.println("after");
		Date d = new Date();
		System.out.println("test ens... " + d);
		}
	@Test
	public void test2() {
		System.out.println("test2");
		dr.get("https://www.facebook.com/");
		WebElement txtusername = dr.findElement(By.id("email"));
		
		txtusername.sendKeys("manoj");
		
		WebElement txtpasswoed = dr.findElement(By.id("pass"));
		txtpasswoed.sendKeys("123445");
		
		WebElement btnlogin = dr.findElement(By.id("login"));
btnlogin.click();
	}
}
