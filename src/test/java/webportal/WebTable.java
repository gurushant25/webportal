package webportal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> tableCol=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
System.out.println(tableCol.size());
List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
System.out.println(tableRow.size());
for(int i=0;i<tableCol.size();i++) {
	for(int j=0;j<tableRow.size();j++) {
		System.out.println(tableRow[i].getText());
	}
}
driver.close();

	}

}
