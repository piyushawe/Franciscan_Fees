package pageObjects;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StudentWiseCollectionReport {
WebDriver dr;
String r= "StudentWiseCollectionReport";

  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
  By school= By.id("ContentPlaceHolder1_ddlAccount");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
		  
  public StudentWiseCollectionReport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openStudentWiseCollectionReport() throws InterruptedException
  {
	     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));		
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 WebElement submenu= dr.findElement(By.linkText("Collection"));
		 builder.moveToElement(submenu).build().perform();
		 dr.findElement(By.linkText("Student Wise Collection Report")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Student Wise Collection Report")));
  }
  public void selectClass(String s) throws InterruptedException
  {
	  Select c=new Select(dr.findElement(cls));
	  try {
	    c.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		new Select(dr.findElement(cls)).selectByIndex(1);
 	  }
	  Thread.sleep(1000);
  }
  public void selectSection(String s) throws InterruptedException
  {
	  Select sec=new Select(dr.findElement(section));
	  try {
	    sec.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		sec.selectByIndex(1);
 	  }
	  Thread.sleep(1000);
  }
  public void selectFeeType(String s) throws InterruptedException
  {
	  Select ftype= new Select(dr.findElement(feetype));
	  try {
	    ftype.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		new Select(dr.findElement(cls)).selectByIndex(1);
 	  }
	  Thread.sleep(1000);
  }
  public void selectSchool(String s)
  {
	  Select sch= new Select(dr.findElement(school));
	  try {
	    sch.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		sch.selectByIndex(1);
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
