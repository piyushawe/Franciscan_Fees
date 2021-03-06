package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class StudentStrengthRatioWiseReport {
	WebDriver dr;
	String r= "StudentStrengthRatioWiseReport";
	
	By cls= By.id("ContentPlaceHolder1_ddlClass");
	By section= By.id("ContentPlaceHolder1_ddlSection");
	By date= By.id("ContentPlaceHolder1_dtjoinfromto_TextBox");
	By detailswithnewoldstudentstatus= By.id("ContentPlaceHolder1_chknewoldstatus");
	By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");

    public StudentStrengthRatioWiseReport(WebDriver d)
    {
	   this.dr=d;
    }
    public void openStudentStrengthRatioWiseReport()
    {
   	    WebElement menu;
   	    Actions builder= new Actions(dr);
	    menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	    builder.moveToElement(menu).build().perform();
	    WebElement menuop1= dr.findElement(By.linkText("Student Strength Ratio Wise Report"));
   	    menuop1.click();
	    dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    dr.switchTo().frame(dr.findElement(By.id("Student Strength Ratio Wise Report")));
    }
    public void selectClass(String c)
    {
    	try {
    	  new Select(dr.findElement(cls)).selectByVisibleText(c);
    	}
    	catch(NoSuchElementException e)
   	    {
    		new Select(dr.findElement(cls)).selectByIndex(1);
   	    }
    }
    public void selectSection(String sec) throws InterruptedException
    {   
    	Thread.sleep(1000);
    	try {
    	  new Select(dr.findElement(section)).selectByVisibleText(sec);
    	}
    	catch(NoSuchElementException e)
   	    {
    		new Select(dr.findElement(section)).selectByIndex(1);
   	    }
    }
    public void selectDate(String mm, String yy, String dd) throws InterruptedException
    {  Thread.sleep(1000);
    	dr.findElement(date).click();
    	  Thread.sleep(1000);
    	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
          Thread.sleep(1000);
          new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
    	  Thread.sleep(1000);
    	  WebElement myw=dr.findElement(By.className("datepick"));
    		 List<WebElement> cells=myw.findElements(By.tagName("td"));
    		  for(WebElement cell: cells) {
    			if (cell.getText().equals(dd)){  
    			cell.click();
    			break; 
    		 }  
      }Thread.sleep(1000);
    } 
    public void clickDetailsWithNewOldStudentStatus()
    {
    	dr.findElement(detailswithnewoldstudentstatus).click();
    }
    public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException {
        Utility u = new Utility();
        dr.findElement(show).click();
        Utilities ut = new Utilities();
        ut.verifyShow(dr, schl, r, sc);
        sleep(5000);
        u.captureScreenshot(dr, schl, r, sc);
        //u.downloadPDF(dr);
    }
}
