package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassWiseStudentDetails {
WebDriver dr;
String r="ClassWiseStudentDetails";

  By school= By.id("ContentPlaceHolder1_ddlSchool");
  By cls= By.id("ContentPlaceHolder1_ddlclass");
  By section= By.id("ContentPlaceHolder1_ddlsection");
  By isdayscholarboarding= By.id("ContentPlaceHolder1_chkdsbd");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
  
  public ClassWiseStudentDetails(WebDriver d)
  {
	 this.dr=d;
  }
  public void openClassWiseStudentDetails()
  {
	  WebElement menu;
   	  Actions builder= new Actions(dr);
      menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Class Wise Student Details"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Class Wise Student Details")));
  }
  public void selectSchool(String s) throws InterruptedException
  {   Thread.sleep(2000);
	  Select sch= new Select(dr.findElement(school));
	  try {
	    sch.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  sch.selectByIndex(1);
	  }
  }
  public void selectClass(String s) throws InterruptedException
  {   Thread.sleep(2000);
	  Select c= new Select(dr.findElement(cls));
	  try {
	      c.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  c.selectByIndex(1);
	  }
  }
  public void selectSection(String s) throws InterruptedException 
  {   Thread.sleep(2000);
	  Select sec= new Select(dr.findElement(section));
	  try {
	    sec.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  sec.selectByIndex(1);
	  }
  }
  public void clickIsDayScholarBoarding() 
  {
	  dr.findElement(isdayscholarboarding).click();
  }
  public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
  {                                                                                                 
   	 Utility u= new Utility();                                                                    
     dr.findElement(show).click();
	 Utilities ut= new Utilities();
	 ut.verifyShow(dr,schl,r,sc);
     Thread.sleep(5000);                                                                          
     u.captureScreenshot(dr,schl,r,sc);                                                           
     //u.downloadPDF(dr);
  } 
}
