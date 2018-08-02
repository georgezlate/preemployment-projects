package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public static WebDriver driver;
	public String baseUrl;
	public static WebDriverWait wait;

	@BeforeClass

	public void initSetP() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void initSet() {
		baseUrl = "http://demoqa.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@AfterMethod
	public void afterMethod() {
		driver.navigate().to("http://demoqa.com/");
	}

	@AfterClass
	public void tearDownP() {
		driver.close();
		if (driver != null) {
			driver.quit();
		}
	}

}
