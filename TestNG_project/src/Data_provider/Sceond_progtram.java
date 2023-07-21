package Data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sceond_progtram {

	WebDriver driver;
	
	@Test(dataProvider = "LoginData")
	public void Data_provider1(String username, String password, String Expected) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		uname.sendKeys(username);
		WebElement passwords= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passwords.sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String Act_title= driver.getTitle();
		System.out.println(Act_title);
		String Exp_title= "OrangeHRM";
		
		if(Expected.equals("Valid")) {
			if(Exp_title.equals(Act_title)) {
				//driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}	
			else if(Expected.equals("Invalid")) {
					if(Exp_title.equals(Act_title)) {
						//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
						Assert.assertTrue(false);
					}
					else {
						Assert.assertTrue(true);
					}
		}
	}
	
	@DataProvider(name= "LoginData")
	public String[][] LoginData() {
		
		String [][] data=  {{"Admin","admin123","Valid"},
						  {"Admin1","admin123","Invalid"},
						  {"Admin","admin1234","Invalid"},
						  {"Admin1","admin1234","Invalid"}};
		return data;
	}
}
