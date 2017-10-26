import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Onedrive\\Selenium sws\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa.drivewebsite.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div/form/div[1]/input"));
		UserName.sendKeys("pvandana@evoketechnologies.com");
		WebElement Password = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div/form/div[2]/input"));
		Password.sendKeys("P@ssw0rd");
		WebElement Submit = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div/form/div[3]/div/span/button"));
		Submit.click();
		
	}
	
	public void setup2()
	{
		
	}

}
