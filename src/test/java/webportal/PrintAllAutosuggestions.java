package webportal;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllAutosuggestions {
	public static WebDriver driver;
//HI
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
WebDriverWait wait=new WebDriverWait(driver, 10);
driver.get("http://www.makemytrip.com/flights");
//Alert alert=new Alert(driver);
//driver.switchTo().alert().dismiss();
//WebElement textBox=driver.findElement(By.xpath("//label[@for='fromCity']"));
//Actions action=new Actions(driver);
//action.moveToElement(textBox);
WebElement textBox1= driver.findElement(By.xpath("//input[@placeholder='From']"));

textBox1.clear();
textBox1.sendKeys("mumbai");
Thread.sleep(2000);

List<WebElement> autoSuggestions=(List<WebElement>) driver.findElement(By.xpath("//div[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']"));
int size=autoSuggestions.size();
System.out.println(size);
	}

}
