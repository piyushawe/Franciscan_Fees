package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Utility {
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ReportViewer1_ctl09")WebElement rpt;
	
	/*public void captureScreenshot(WebDriver dr, String str) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f,new File("D:/fee_screenshots/cjmdelhi/"+str+"/"+str+timeStamp+".png"));
	}*/
	
	public void captureScreenshot(WebDriver dr, String str, String r, Collection<String> sc) throws IOException
	 {
		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		 File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f,new File("D:/fee_screenshots/"+str+"/Reports/"+r+"/"+r+sc+timeStamp+".png"));
	 }
	
	public void findStudentOnReport(WebDriver dr,String name)
	{
	   WebElement rec=dr.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceHolder1_ReportViewer1_ctl05\']/div/div[3]/table"));
	   List<WebElement>cells= rec.findElements(By.tagName("td"));
	   for(WebElement cell:cells)
	   {
		  dr.findElement(By.name("ctl00$ContentPlaceHolder1$ReportViewer1$ctl05$ctl03$ctl00")).sendKeys(name);
		  dr.findElement(By.linkText("Find")).click();
		  break;
	   }
	   WebElement scroll= dr.findElement(By.name("ctl00$ContentPlaceHolder1$ReportViewer1$ctl09$ScrollPosition"));
	   JavascriptExecutor js= (JavascriptExecutor)dr;
	   js.executeScript("window.scrollBy(0,250)",scroll);
	} 
	
	public void downloadPDF(WebDriver dr) throws InterruptedException
	{
	   WebElement t=dr.findElement(By.id("ctl00_ContentPlaceHolder1_ReportViewer1_ctl05_ctl04_ctl00_Button"));
	   Thread.sleep(500);
	   t.findElement(By.xpath("//img[@alt='Export drop down menu']")).click();
	   Thread.sleep(500);
	   dr.findElement(By.xpath("//a[@title='PDF']")).click();	  
	}

	public void waitForReportToLoad(WebDriver d)
	{
		AjaxElementLocatorFactory fct= new AjaxElementLocatorFactory(d, 1000);
		PageFactory.initElements(fct, this);
	}
}

