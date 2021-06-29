package webportal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class FewAnnotationsUse {
	// public static WebDriverManager driver=new ChromeDriverManager();
	// WebDriverManager.chromedriver().setup();
	public static String browser = "chrome";
	public static WebDriver driver;

	@BeforeTest
	public void DriverActivate() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	}

	@Test
	public void check() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterClass
	public void terminateBrowser() {
		driver.close();
	}
}
