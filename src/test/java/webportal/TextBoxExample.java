package webportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	WebDriver	driver=new ChromeDriver();
	driver.get(");
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	}

}
