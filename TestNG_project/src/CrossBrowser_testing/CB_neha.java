package CrossBrowser_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB_neha {

	public class CrossBrowser1 {

		WebDriver driver;

		@Parameters("Browsername")

		@Test

		public void OrangeHRM(String Browsername) {

			if (Browsername.equalsIgnoreCase("Chrome")) {

				System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
				//driver = new FirefoxDriver();

				//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}

			else if (Browsername.equalsIgnoreCase("FireFox")) {
				System.setProperty("Webdriver.gecko.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\geckodriver.exe");
				driver = new FirefoxDriver();
		
			}

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			/*
			 * String exp_name = "Paul Collings"; WebElement act_name =
			 * driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
			 * 
			 * Assert.assertEquals(exp_name, act_name);
			 * 
			 * System.out.println("correct username");
			 * System.out.println("Execution completed");
			 */

			boolean Test = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
			Assert.assertTrue(Test);

			driver.quit();

		}
	}}
