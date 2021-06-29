package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseClass;

public class Utilities extends BaseClass {

	public static void screenshot() throws IOException {
		Date currentDate = new Date();
		TakesScreenshot takescr = (TakesScreenshot)driver;
		String currentfilename = currentDate.toString().replace(":", "-").replace(" ", "-");
		File Takescr = takescr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Takescr, new File("c://screenshots//"+currentfilename+".png"));

	}

}
