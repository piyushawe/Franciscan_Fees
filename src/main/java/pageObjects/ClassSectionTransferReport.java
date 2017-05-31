package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassSectionTransferReport {
WebDriver dr;
String r="ClassSectionTransferReport";

  By cls= By.id("ContentPlaceHolder1_ddlclass");
  By section= By.id("ContentPlaceHolder1_ddlsection");
  By oldacademicyear= By.id("ContentPlaceHolder1_ddlOldAcademicYear");
  By oldfinancialyear= By.id("ContentPlaceHolder1_ddlOldFinancialYear");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
  
  public ClassSectionTransferReport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openClassSectionTransferReport()
  {
	  WebElement menu;
   	  Actions builder= new Actions(dr);
   	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Class Section Transfer Report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Class Section Transfer Report")));
  }
  public void selectClass(String s)
  {
	  Select c= new Select(dr.findElement(cls));
	  try {
	    c.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  c.selectByIndex(1);
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
  public void selectOldAcademicYear(String y)
  {
	  Select acyr= new Select(dr.findElement(oldacademicyear));
	  try {
	    acyr.selectByVisibleText(y);
	  }
	  catch(NoSuchElementException e)
	  {
		  acyr.selectByIndex(3);
	  }
  }
  public void selectOldFinancialYear(String y)
  {
	  Select fyr= new Select(dr.findElement(oldfinancialyear));
	  try {
	    fyr.selectByVisibleText(y);
	  }
	  catch(NoSuchElementException e)
	  {
		  fyr.selectByIndex(3);
	  }
  }
  public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
  {                                                                                                 
   	 Utility u= new Utility();                                                                    
     dr.findElement(show).click();                                                                
     Thread.sleep(5000);                                                                          
     u.captureScreenshot(dr,schl,r,sc);                                                           
     u.downloadPDF(dr);                                                                           
  }   
}
