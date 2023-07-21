package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook_parameter {

	WebDriver driver;
	@Parameters({"Username","Password"})
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void email(String Username) {
		WebElement name =driver.findElement(By.id("email"));
		name.sendKeys(Username);
	}
	
	@Test(priority=2)
	public void password(String Password) {
		WebElement Pwd =driver.findElement(By.id("pass"));
		Pwd.sendKeys(Password);	
	}
	
	@Test(priority=3)
	public void button (){
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}
}
