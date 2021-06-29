package webportal;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(enabled = false)
	public void goodM() {
		System.out.println("Hi, Good morning");
	}

	@Test
	public void bye() {
		System.out.println("Bye TC");
		throw new SkipException("Meow SKipped");
	}

	@BeforeTest
	public void officeopen() {
		System.out.println("office open");
	}

	@Test
	public void officeClose() {
		boolean a = true;
		if (a == false) {
			throw new SkipException("Meow SKipped");

		}
		System.out.println("office Close");
	}

	@Test
	public void print1() {
		System.out.println("Ramesh");
	}

}
