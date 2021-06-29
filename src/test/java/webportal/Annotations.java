package webportal;

import org.testng.annotations.Test;

public class Annotations {
	@Test(priority = 3)
	public void b_run() {
		System.out.println("Hi B");
	}
	@Test(priority = 1)
	public void a_run() {
		System.out.println("Hi A");
	}
	@Test(priority = 10)
	public void c_run() {
		System.out.println("Hi C");
	}
}
