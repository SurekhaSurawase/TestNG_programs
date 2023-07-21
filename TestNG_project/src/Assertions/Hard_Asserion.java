package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_Asserion {

	//Assertions are added in code to determine the state of application whether it is same as we expect or not.
	//2 types: Hard and soft assertions
	//Hard Assertion: if we apply hard assertions and the TC fails, throws exception ands the execution stops and jumps to the execution of next TC
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
		
//		Assert.assertTrue(username.isDisplayed());
//		//username.sendKeys("Admin");
//		
//		Assert.assertTrue(Password.isDisplayed());
//		Password.sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertFalse(username.isDisplayed());
		username.sendKeys("Admin");
		
	}
	
	@Test(priority=2)
	public void button() {
		WebElement login= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
	}
}
