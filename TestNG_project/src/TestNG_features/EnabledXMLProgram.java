package TestNG_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnabledXMLProgram {
	
	WebDriver driver;
	@BeforeClass
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
	
	@Test
	public void Test4() {
		System.out.println("Test4");
	}
	
	@AfterClass
	public void logout() {
		driver.quit();
	}
}
