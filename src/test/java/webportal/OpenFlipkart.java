package webportal;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseClass;

public class OpenFlipkart extends BaseClass{
	@Test
	public void openFlip() {
		driver.get("https://www.flipkart.com/");
		Assert.assertFalse(true);
	}
	

}
