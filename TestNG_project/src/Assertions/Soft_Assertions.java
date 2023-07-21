package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

	//Soft Assertion: if we apply soft assertion and if it fails then no exeption is thrown and execution continues to next step
	//to apply methods of soft assertion we need to create object of soft assertion class
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=1)
	public void Orange_HRM() {
		WebElement username= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement Password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		
		SoftAssert soft= new SoftAssert();
		
//		Assert.assertTrue(username.isDisplayed());
//		//username.sendKeys("Admin");
//		
//		Assert.assertTrue(Password.isDisplayed());
//		Password.sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		soft.assertTrue(username.isDisplayed());
		username.sendKeys("Admin");
		
		WebElement username1= driver.findElement(By.xpath("//input[@name=\"username1\"]"));
		soft.assertTrue(username1.isDisplayed());//false
		//to collect all the fail assertion we user .assertAll();
		soft.assertAll();
		System.out.println("Execution completed");
		
	}
}
