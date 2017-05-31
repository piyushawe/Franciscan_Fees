package MasterSettingsPageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public void captureScreenshot(WebDriver dr, String str, String r, Collection<String> sc) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f,new File("D:/fee_screenshots/"+str+"/"+r+"/"+r+sc+timeStamp+".png"));
	}
	
}
