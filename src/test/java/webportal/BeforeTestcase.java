package webportal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BeforeTestcase {
	@BeforeMethod
	public void goodM() {
		System.out.println("Hi, Good morning");
	}
	@AfterTest
	 public void bye() {
			System.out.println("Bye TC");
	 }
	 @BeforeTest
	 public void officeopen() {
			System.out.println("office open");
	 }
	 @AfterTest
	 public void officeClose() {
			System.out.println("office Close");
	 }
	 @Test
	public void print1() {
		System.out.println("Ramesh");	
	}
}
