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

public class DateWiseAdmissionReport {
WebDriver dr;
String r= "DateWiseAdmissionReport";

  By fromdate= By.id("ContentPlaceHolder1_txtfromDate_TextBox");
  By todate= By.id("ContentPlaceHolder1_txttoDate_TextBox");
  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");

  public DateWiseAdmissionReport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openDateWiseAdmissionReport()
  {
	  WebElement menu;
  	  Actions builder= new Actions(dr);
  	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
  	  dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Date Wise Admission Report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Date Wise Admission Report")));
  }
  public void selectFromDate(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(fromdate).click();
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
  public void selectToDate(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(todate).click();
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
  public void selectClass(String c)
  {
	  Select cs= new Select(dr.findElement(cls));
	  try {
	    cs.selectByVisibleText(c);
	  }
	  catch(NoSuchElementException e)
	  {
 		cs.selectByIndex(1);
	  }
  }
  public void selectSection(String s)
  {
	  Select sec= new Select(dr.findElement(section));
	  try {
	    sec.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
 		 sec.selectByIndex(1);
	  }
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
