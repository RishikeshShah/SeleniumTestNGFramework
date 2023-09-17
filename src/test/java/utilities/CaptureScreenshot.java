package utilities;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseClass;

public class CaptureScreenshot extends BaseClass{
	public void getScreenshot() {
	
		Date currentdate = new Date();
		String timeStamp = currentdate.toString().replace(" ", "_").replace(":", "-");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			// System.getProperty("user.dir") gives Projekt Path and Time Stamp provides unique name to file name
			FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\screenshot\\"+timeStamp+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



