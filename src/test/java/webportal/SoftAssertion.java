package webportal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	public static WebDriver driver;
	@Test
	public void AssertionExample1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		int a=10;
		int b=20;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		driver.get("https://www.guru99.com/object-repository-selenium.html");
		String actualTitle="Creating Object Repository in Selenium WebDriver: XML & Properties file";
		String ExpectedTitle=driver.getTitle();
		sa.assertEquals(actualTitle, ExpectedTitle);
		//sa.assertAll();
		driver.close();
	}

}
