package pageObjects;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	 void verifyPage(WebDriver dr, String expected)
      { 
		try { 
			Assert.assertTrue(dr.getPageSource().contains(expected));
			System.out.println("TEST PASSED");
		}
		catch(Throwable e)
		{  
	       System.out.println(e);
		   System.out.println("TEST FAILED");
		   try {
				captureScreenshot(dr,expected);
			} catch (IOException io) {
				io.printStackTrace();
			    }
		}
	}
	void captureScreenshot(WebDriver dr, String str) throws IOException
	{
		File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f,new File("D:/erpscreenshots/"+str+".png"));
	}
}
