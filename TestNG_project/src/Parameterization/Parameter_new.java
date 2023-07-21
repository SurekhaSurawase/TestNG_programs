package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parameter_new {

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
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void email(String name) {
		WebElement Username=driver.findElement(By.id("email"));
		Username.sendKeys(name);
	}
	
	public void password(String pwd) {
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys(pwd);
	}
}
