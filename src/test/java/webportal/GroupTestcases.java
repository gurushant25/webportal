package webportal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTestcases {
	@Test(groups = "Regression")
	public void goodM() {
		System.out.println("Hi, Good morning");
	}
	@Test
	 public void bye() {
			System.out.println("Bye TC");
	 }
	 @Test(groups = "Regression")
	 public void officeopen() {
			System.out.println("office open");
	 }
	@Test
	 public void officeClose() {
			System.out.println("office Close");
	 }
	@Test
	public void print1() {
		System.out.println("Ramesh");	
	}

}
